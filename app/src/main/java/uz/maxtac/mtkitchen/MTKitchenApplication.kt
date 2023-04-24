package uz.maxtac.mtkitchen

import android.app.Application
import org.koin.core.context.startKoin

class MTKitchenApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {

        }
    }
}