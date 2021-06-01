package com.example.buynow


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

import com.example.buynow.Utils.Extensions.toast
import com.example.buynow.Utils.FirebaseUtils.databaseReference
import com.example.buynow.Utils.FirebaseUtils.firebaseAuth
import com.example.buynow.Utils.FirebaseUtils.firebaseDataBase
import com.example.buynow.Utils.FirebaseUtils.firebaseUser
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.database.DatabaseReference
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.HashMap


class SignUpActivity : AppCompatActivity() {


    private lateinit var fullName: EditText
    private lateinit var emailEt: EditText
    private lateinit var passEt: EditText
    private lateinit var CpassEt: EditText



    private lateinit var loadingDialog: loadingDialog

    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUpBtn = findViewById<Button>(R.id.signUpBtn_signUpPage)
        fullName = findViewById(R.id.nameEt_signUpPage)
        emailEt = findViewById(R.id.emailEt_signUpPage)
        passEt = findViewById(R.id.PassEt_signUpPage)
        CpassEt = findViewById(R.id.cPassEt_signUpPage)
        val signInTv = findViewById<TextView>(R.id.signInTv_signUpPage)



        textAutoCheck()
        loadingDialog = loadingDialog(this)
        signInTv.setOnClickListener {
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


        signUpBtn.setOnClickListener {
            checkInput()

        }
    }

    private fun textAutoCheck() {

        fullName.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                if (fullName.text.isEmpty()){
                    fullName.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)

                }
                else if (fullName.text.length >= 4){
                    fullName.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(applicationContext,R.drawable.ic_check), null)
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {

                fullName.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (count >= 4){
                    fullName.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(applicationContext,R.drawable.ic_check), null)
                }
            }
        })

        emailEt.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                if (emailEt.text.isEmpty()){
                    emailEt.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)

                }
                else if (emailEt.text.matches(emailPattern.toRegex())) {
                    emailEt.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(applicationContext,R.drawable.ic_check), null)
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {

                emailEt.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (emailEt.text.matches(emailPattern.toRegex())) {
                    emailEt.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(applicationContext,R.drawable.ic_check), null)
                }
            }
        })

        passEt.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                if (passEt.text.isEmpty()){
                    passEt.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)

                }
                else if (passEt.text.length > 5){
                    passEt.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(applicationContext,R.drawable.ic_check), null)
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {

                passEt.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (count > 5){
                    passEt.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(applicationContext,R.drawable.ic_check), null)
                }
            }
        })

        CpassEt.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                if (CpassEt.text.isEmpty()){
                    CpassEt.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)

                }
                else if (CpassEt.text.toString() == passEt.text.toString()){
                    CpassEt.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(applicationContext,R.drawable.ic_check), null)
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {

                CpassEt.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (CpassEt.text.toString() == passEt.text.toString()){
                    CpassEt.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(applicationContext,R.drawable.ic_check), null)
                }
            }
        })

    }

    private fun checkInput() {
        if (fullName.text.isEmpty()){
            toast("Name can't empty!")
            return
        }
        if (emailEt.text.isEmpty()){
            toast("Email can't empty!")
            return
        }

        if (!emailEt.text.matches(emailPattern.toRegex())) {
            toast("Enter Valid Email")
           return
        }
        if(passEt.text.isEmpty()){
            toast("Password can't empty!")
            return
        }
        if (passEt.text.toString() != CpassEt.text.toString()){
            toast("Password not Match")
            return
        }

        signIn()


    }


    private fun signIn() {
            loadingDialog.startLoadingDialog()


            /*create a user*/
            firebaseAuth.createUserWithEmailAndPassword(emailEt.text.toString().trim(), passEt.text.toString().trim())
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        storeUserData()
                        sendEmailVerification()
                        loadingDialog.dismissDialog()

                    } else {
                        toast("failed to Authenticate !")
                        loadingDialog.dismissDialog()
                    }
                }

    }

    private fun storeUserData() {



        val userHashmap: HashMap<String, String>  =  HashMap()

        userHashmap.put("userName", fullName.text.toString())
        userHashmap.put("userImage", "")
        userHashmap.put("userUid", firebaseUser!!.uid)
        userHashmap.put("userEmail", emailEt.text.toString())
        userHashmap.put("userAddress", "")
        userHashmap.put("userPhone", "")



        databaseReference.child("Users")
            .child(firebaseUser.uid)
            .setValue(userHashmap)
            .addOnSuccessListener(OnSuccessListener {
                toast("User Data Stored")
            })
    }

    private fun sendEmailVerification() {
        val userEmail:String = emailEt.text.toString().trim()
        firebaseUser?.let {
            it.sendEmailVerification().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this, EmailVerifyActivity::class.java)
                    intent.putExtra("EmailAddress", emailEt.text.toString().trim())
                    intent.putExtra("loginPassword", passEt.text.toString().trim())
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}


