package com.example.buynow.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import com.example.buynow.R
import com.example.buynow.utils.Extensions.toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class SettingsActivity : AppCompatActivity() {

    lateinit var nameEt_SettingsPage:EditText
    lateinit var EmailEt_SettingsPage:EditText
    lateinit var saveSetting_SettingsBtn:Button

    private val userCollectionRef = Firebase.firestore.collection("Users")
    val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        nameEt_SettingsPage = findViewById(R.id.nameEt_SettingsPage)
        EmailEt_SettingsPage = findViewById(R.id.EmailEt_SettingsPage)
        saveSetting_SettingsBtn = findViewById(R.id.saveSetting_SettingsBtn)
        val backIv_ProfileFrag:ImageView = findViewById(R.id.backIv_ProfileFrag)


        backIv_ProfileFrag.setOnClickListener {
            onBackPressed()
        }

        getUserData()

        saveSetting_SettingsBtn.setOnClickListener {
            textCheck()
        }

        textAutoCheck()
    }


    private fun getUserData() = CoroutineScope(Dispatchers.IO).launch {
        try {

            val querySnapshot = userCollectionRef
                .document(firebaseAuth.uid.toString())
                .get().await()

            val userName:String = querySnapshot.data?.get("userName").toString()
            val userEmail:String = querySnapshot.data?.get("userEmail").toString()


            withContext(Dispatchers.Main){


            }


        }catch (e:Exception){

        }
    }

    private fun textCheck() {

        if(nameEt_SettingsPage.text.isEmpty()){
            toast("Name Can't be Empty")
            return
        }
         if(EmailEt_SettingsPage.text.isEmpty()){
             toast("Email Can't be Empty")
            return
        }

        saveNameAndEmailToFireStore()
    }

    private fun saveNameAndEmailToFireStore()= CoroutineScope(Dispatchers.IO).launch {

        try {

            userCollectionRef.document(firebaseAuth.uid.toString())
                .update("userName" , nameEt_SettingsPage.text.toString() ).await()
            userCollectionRef.document(firebaseAuth.uid.toString())
                .update("userEmail" , EmailEt_SettingsPage.text.toString() ).await()

            withContext(Dispatchers.Main){
                Toast.makeText(this@SettingsActivity, "Saved", Toast.LENGTH_SHORT).show()
                saveSetting_SettingsBtn.visibility = View.GONE
            }

        }catch (e:Exception){
            withContext(Dispatchers.Main){
                Toast.makeText(this@SettingsActivity, ""+e.message.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun textAutoCheck() {

        nameEt_SettingsPage.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                saveSetting_SettingsBtn.visibility = View.VISIBLE
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if(count > 1){
                    saveSetting_SettingsBtn.visibility = View.VISIBLE
                }
            }
        })

        EmailEt_SettingsPage.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                saveSetting_SettingsBtn.visibility = View.VISIBLE
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if(count > 1){
                    saveSetting_SettingsBtn.visibility = View.VISIBLE
                }
            }
        })
    }
}