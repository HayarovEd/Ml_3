package homo.cashwin.online.domain.model

sealed class StatusApplication {
    object Loading: StatusApplication()
    object Mock : StatusApplication()

    class Web (
        val url: String,
        val offerName: String
    ): StatusApplication()

    object NoConnect: StatusApplication()
}
