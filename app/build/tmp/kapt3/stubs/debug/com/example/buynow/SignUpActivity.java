package com.example.buynow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/buynow/SignUpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CpassEt", "Landroid/widget/EditText;", "emailEt", "emailPattern", "", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "fullName", "passEt", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "userCollectionRef", "Lcom/google/firebase/firestore/CollectionReference;", "checkInput", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "signIn", "storeUserData", "Lkotlinx/coroutines/Job;", "user", "Lcom/example/buynow/Model/User;", "textAutoCheck", "app_debug"})
public final class SignUpActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText fullName;
    private android.widget.EditText emailEt;
    private android.widget.EditText passEt;
    private android.widget.EditText CpassEt;
    private final com.google.firebase.firestore.CollectionReference userCollectionRef = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    public android.app.ProgressDialog progressDialog;
    private final java.lang.String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    
    public SignUpActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getFirebaseAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.NotNull()
    android.app.ProgressDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void textAutoCheck() {
    }
    
    private final void checkInput() {
    }
    
    private final void signIn() {
    }
    
    private final kotlinx.coroutines.Job storeUserData(com.example.buynow.Model.User user) {
        return null;
    }
}