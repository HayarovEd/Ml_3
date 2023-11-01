package homo.cashwin.online.data


import homo.cashwin.online.domain.model.basedto.BaseDto
import retrofit2.http.GET

interface ApiServer {
    @GET ("game/db.json")
    suspend fun getDataDb () : BaseDto
}