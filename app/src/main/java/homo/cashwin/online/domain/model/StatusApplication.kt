package homo.cashwin.online.domain.model

sealed class StatusApplication {
    object Loading: StatusApplication()
    object NoConnect : StatusApplication()

    class Web (
        val url: String
    ): StatusApplication()
}
