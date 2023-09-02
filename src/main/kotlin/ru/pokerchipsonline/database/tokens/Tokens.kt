package ru.pokerchipsonline.database.tokens

import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction
import ru.pokerchipsonline.database.users.UserDTO
import ru.pokerchipsonline.database.users.Users

object Tokens: Table() {
    private val id = Tokens.varchar("id", 50)
    private val token = Users.varchar("token", 50)
    private val login = Users.varchar("login", 25)
    fun insert(tokenDTO: TokenDTO) {
        transaction {
            Tokens.insert {
                it[id] = tokenDTO.rowId
                it[login] = tokenDTO.login
                it[token] = tokenDTO.token
            }
        }
    }
}
