package br.com.zup.marvel.ui.register.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.marvel.EMAIL_EMPTY
import br.com.zup.marvel.PASSWORD_EMPTY
import br.com.zup.marvel.REGISTRY_ERROR
import br.com.zup.marvel.data.model.User
import br.com.zup.marvel.data.repository.AuthRepository

class RegisterViewModel: ViewModel() {
    private val authRepository = AuthRepository()

    private var _registerState = MutableLiveData<User>()
    val registerState: LiveData<User> = _registerState

    private var _errorState = MutableLiveData<String>()
    val errorState: LiveData<String> = _errorState

    fun validateUserData(user:User){
        when{
            user.email.isEmpty() -> {
                _errorState.value = EMAIL_EMPTY
            }
            user.password.isEmpty() -> {
                _errorState.value = PASSWORD_EMPTY
            }
            else -> {
                registerUser(user)
            }
        }
    }

    private fun registerUser(user: User){
        try {
            authRepository.register(user.email,user.password)
                .addOnSuccessListener {
                    _registerState.value = user
                }
                .addOnFailureListener{
                    _errorState.value = REGISTRY_ERROR
                }
        }catch (e: Exception){
            _errorState.value = e.message
        }
    }
}