package ru.pokerchipsonline.features.login


import io.ktor.server.application.*
import io.ktor.server.routing.*
import ru.pokerchipsonline.features.register.RegisterController


fun Application.configureRegisterRouting() {

    routing {
        post("/register") {
            val registerController = RegisterController(call)
            registerController.registerNewUser()
        }
    }
}

