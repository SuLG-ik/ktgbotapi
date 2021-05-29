package dev.inmo.tgbotapi.types.ChatMember

import dev.inmo.tgbotapi.types.*
import dev.inmo.tgbotapi.types.ChatMember.abstracts.ChatMember
import dev.inmo.tgbotapi.types.ChatMember.abstracts.LeftChatMember
import kotlinx.serialization.*

@Serializable
data class LeftChatMemberImpl(@SerialName(userField) override val user: User) : LeftChatMember {
    @SerialName(statusField)
    @Required
    private val type: String = "left"
}

@Deprecated("Renamed", ReplaceWith("LeftChatMemberImpl", "dev.inmo.tgbotapi.types.ChatMember.LeftChatMemberImpl"))
typealias LeftChatMember = LeftChatMemberImpl
