package homo.cashwin.online.domain

import homo.cashwin.online.data.Resource
import homo.cashwin.online.domain.model.basedto.BaseDto

interface RepositoryServer {
    suspend fun getDataDb() : Resource<BaseDto>
}