package ru.pokerchipsonline.database.tokens

import kotlinx.serialization.Serializable

@Serializable
data class TokenDTO (
    val rowId: String,
    val login: String,
    val token: String
)