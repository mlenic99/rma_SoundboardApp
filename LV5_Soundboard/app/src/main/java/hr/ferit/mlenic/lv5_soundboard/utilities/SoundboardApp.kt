package hr.ferit.mlenic.lv5_soundboard.utilities

import android.app.Application
import android.content.Context
import hr.ferit.mlenic.lv5_soundboard.di.appModule
import hr.ferit.mlenic.lv5_soundboard.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SoundboardApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SoundboardApp)
            modules(appModule, viewModelModule)

        }
    }
}
