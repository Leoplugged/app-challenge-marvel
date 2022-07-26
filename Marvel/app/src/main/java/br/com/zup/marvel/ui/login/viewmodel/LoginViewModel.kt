package br.com.zup.marvel.ui.login.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.marvel.EMAIL_EMPTY
import br.com.zup.marvel.LOGIN_ERROR
import br.com.zup.marvel.PASSWORD_EMPTY
import br.com.zup.marvel.data.model.User
import br.com.zup.marvel.data.repository.AuthRepository

class LoginViewModel: ViewModel() {
    private val authRepository = AuthRepository()

    private var _loginState = MutableLiveData<User>()
    val loginState: LiveData<User> = _loginState

    private var _errorState = MutableLiveData<String>()
    val errorState: LiveData<String> = _errorState

    fun validateUser(user: User){
        when{
            user.email.isEmpty() -> {
                _errorState.value = EMAIL_EMPTY
            }
            user.password.isEmpty() -> {
                _errorState.value = PASSWORD_EMPTY
            }
            else -> {
                login(user)
            }
        }
    }

    private fun login(user: User){
        try {
            authRepository.login(user.email,user.password)
                .addOnSuccessListener { _loginState.value = user }
                .addOnFailureListener { _errorState.value = LOGIN_ERROR + it.message }
        }catch (e: Exception){
            _errorState.value = e.message
        }
    }
}