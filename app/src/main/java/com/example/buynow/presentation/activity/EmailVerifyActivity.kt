package com.example.buynow.presentation.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.buynow.R

import com.example.buynow.utils.Extensions.toast

import com.example.buynow.utils.FirebaseUtils.firebaseAuth
import com.example.buynow.utils.FirebaseUtils.firebaseDataBase
import com.example.buynow.utils.FirebaseUtils.firebaseUser
import com.google.firebase.database.DatabaseReference



class EmailVerifyActivity : AppCompatActivity() {

    lateinit var EmailAddress:String
    lateinit var loginPassword:String

    lateinit var reSendEmail_emailVerifyPage:TextView
    lateinit var tryAgain_emailVerifyPage:Button
    lateinit var title_emailVerifyPage:TextView
    lateinit var msg_emailVerifyPage:TextView
    lateinit var image_emailVerifyPage:ImageView

    lateinit var dataRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_verify)


        tryAgain_emailVerifyPage = findViewById(R.id.tryAgain_emailVerifyPage)
        title_emailVerifyPage = findViewById(R.id.title_emailVerifyPage)
        msg_emailVerifyPage = findViewById(R.id.msg_emailVerifyPage)
        image_emailVerifyPage = findViewById(R.id.image_emailVerifyPage)
        reSendEmail_emailVerifyPage = findViewById(R.id.reSendEmail_emailVerifyPage)

        EmailAddress = intent.getStringExtra("EmailAddress").toString()
        loginPassword = intent.getStringExtra("loginPassword").toString()

        dataRef = firebaseDataBase.getReference("Users")

        verifyEmail()


        tryAgain_emailVerifyPage.setOnClickListener {
            firebaseUser?.reload()
            verifyEmail()
        }

        reSendEmail_emailVerifyPage.setOnClickListener {
            sendEmailVerification()
        }
    }

    private fun sendEmailVerification() {
        firebaseUser?.let {
            it.sendEmailVerification().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    toast("New Link send your $EmailAddress Email Address.")
                }
            }
        }
    }

    private fun verifyEmail() {

        if(firebaseUser?.isEmailVerified == true){

            image_emailVerifyPage.setImageResource(R.drawable.ic_success)
            title_emailVerifyPage.text = "Congratulations!!!"
            msg_emailVerifyPage.text = "Your email has been Verified. You can login your account."
            tryAgain_emailVerifyPage.visibility = View.GONE
            reSendEmail_emailVerifyPage.visibility = View.GONE

            Handler().postDelayed({

                firebaseAuth.signInWithEmailAndPassword(EmailAddress, loginPassword)
                    .addOnCompleteListener { signIn ->
                        if (signIn.isSuccessful) {
                            startActivity(Intent(this, HomeActivity::class.java))
                            toast("signed in successfully")
                            finish()
                        } else {
                            toast("sign in failed")

                        }
                    }

            }, 2000)


        }
        else{
            //email not verified
            image_emailVerifyPage.setImageResource(R.drawable.ic_email)
            title_emailVerifyPage.text = "Verify Your Email"
            msg_emailVerifyPage.text = "We send verification link to your " + EmailAddress  + " email. Please check your email and verify to active your account."
            tryAgain_emailVerifyPage.visibility = View.VISIBLE
        }
    }


}