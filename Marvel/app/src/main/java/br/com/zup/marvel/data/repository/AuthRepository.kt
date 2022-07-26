package br.com.zup.marvel.data.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class AuthRepository {
    private val auth: FirebaseAuth = Firebase.auth

    fun register(email: String, password: String): Task<AuthResult> {
        return auth.createUserWithEmailAndPassword(email,password)
    }

    fun logout(){
        auth.signOut()
    }

    fun login(email: String, password: String): Task<AuthResult> {
        return auth.signInWithEmailAndPassword(email,password)
    }

    fun getUserEmail(): String = auth.currentUser?.email.toString()
}