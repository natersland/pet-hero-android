package naters.fantasy.pethero.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class PetData(
    val id: Int?,
    val petType: PetType,
    val petName: String?,
    val petBirthDate: String,
    val petAge: Double,
    val petGender: String?
) : Parcelable {
    val humanAge get() = petAge * 2
}

enum class PetType {
    dog, cat
}