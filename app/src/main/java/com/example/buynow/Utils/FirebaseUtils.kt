package com.example.buynow.Utils

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

object FirebaseUtils {
    val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    val firebaseUser: FirebaseUser? = firebaseAuth.currentUser
    val firebaseDataBase: FirebaseDatabase = FirebaseDatabase.getInstance()
    val  databaseReference:DatabaseReference = firebaseDataBase.reference
}