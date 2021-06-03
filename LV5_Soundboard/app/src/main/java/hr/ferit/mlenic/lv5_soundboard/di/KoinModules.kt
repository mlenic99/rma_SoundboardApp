package hr.ferit.mlenic.lv5_soundboard.di

import hr.ferit.mlenic.lv5_soundboard.sounds.AudioPlayer
import hr.ferit.mlenic.lv5_soundboard.sounds.SoundPoolPlayer
import hr.ferit.mlenic.lv5_soundboard.ui.SoundBoardViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<AudioPlayer> { SoundPoolPlayer(androidContext()) }
}

val viewModelModule = module {
    viewModel<SoundBoardViewModel> { SoundBoardViewModel(get()) }
}