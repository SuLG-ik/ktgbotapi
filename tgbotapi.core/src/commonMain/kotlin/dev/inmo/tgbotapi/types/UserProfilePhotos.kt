package dev.inmo.tgbotapi.types

import dev.inmo.tgbotapi.types.files.Photo
import dev.inmo.tgbotapi.types.files.PhotoSerializer
import dev.inmo.tgbotapi.utils.RiskFeature
import kotlinx.serialization.*
import kotlinx.serialization.builtins.ListSerializer

@Serializable
data class UserProfilePhotos (
    @SerialName("total_count")
    val count: Int,
    @Serializable(UserProfilePhotosPhotosSerializer::class)
    val photos: List<Photo>
)

@RiskFeature
object UserProfilePhotosPhotosSerializer : KSerializer<List<Photo>> by ListSerializer(
    PhotoSerializer
)
