package homo.cashwin.online

import android.app.Application
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig
import dagger.hilt.android.HiltAndroidApp
import homo.cashwin.online.data.APPS_FLYER
import homo.cashwin.online.data.APP_METRICA
import homo.cashwin.online.data.MY_TRACKER

@HiltAndroidApp
class Ml3App : Application() {
    override fun onCreate() {
        super.onCreate()

        val config = YandexMetricaConfig.newConfigBuilder(APP_METRICA).build()


        MyTracker.initTracker(MY_TRACKER, this)
        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)
        AppsFlyerLib.getInstance().init(APPS_FLYER, null, this)
        AppsFlyerLib.getInstance().start(this)
    //UserX.init("YOUR_API_KEY")
    }
}