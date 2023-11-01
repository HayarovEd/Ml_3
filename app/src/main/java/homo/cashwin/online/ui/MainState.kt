package homo.cashwin.online.ui

import homo.cashwin.online.domain.model.StatusApplication
import homo.cashwin.online.domain.model.basedto.BaseDto

data class MainState(
    val statusApplication: StatusApplication = StatusApplication.Loading/*Web(url = "https://ya.ru/", offerName = "Offer")*/,
)
