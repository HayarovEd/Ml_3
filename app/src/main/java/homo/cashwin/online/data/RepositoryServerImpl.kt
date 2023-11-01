package homo.cashwin.online.data

import homo.cashwin.online.data.Resource.Error
import homo.cashwin.online.data.Resource.Success
import homo.cashwin.online.domain.RepositoryServer
import homo.cashwin.online.domain.model.basedto.BaseDto
import javax.inject.Inject

class RepositoryServerImpl @Inject constructor(
    private val apiServer: ApiServer
) : RepositoryServer {
    override suspend fun getDataDb(): Resource<BaseDto> {
        return try {
            val folder = apiServer.getDataDb()
            Success(
                data = folder
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Error(e.message ?: "An unknown error")
        }
    }
}