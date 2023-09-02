package ru.pokerchipsonline

import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import org.jetbrains.exposed.sql.Database
import ru.pokerchipsonline.features.login.configureLoginRouting
import ru.pokerchipsonline.features.login.configureRegisterRouting
import ru.pokerchipsonline.plugins.*



fun main() {
    Database.connect("jdbc:postgresql://localhost:8080/railway", driver = "org.postgresql.Driver",
        user = "postgres", password = "o6d1Ww5w2hwrblZojWoK" )

    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        configureLoginRouting()
        configureRegisterRouting()
    }.start(wait = true)
}

