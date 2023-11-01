package homo.cashwin.online.domain.model.basedto


import com.google.gson.annotations.SerializedName

data class BaseDto(
    @SerializedName("app_config")
    val appConfig: AppConfig,
)