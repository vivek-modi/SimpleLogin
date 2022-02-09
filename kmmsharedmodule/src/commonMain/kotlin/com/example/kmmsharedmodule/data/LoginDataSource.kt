package com.example.kmmsharedmodule.data

import com.example.kmmsharedmodule.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication

            return Result.Success()
        } catch (e: Throwable) {
            return Result.Error(RuntimeException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}