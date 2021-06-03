package hr.ferit.mlenic.lv5_soundboard.ui

import androidx.lifecycle.ViewModel
import hr.ferit.mlenic.lv5_soundboard.sounds.AudioPlayer

class SoundBoardViewModel(private val audioPlayer: AudioPlayer) : ViewModel(){

    fun playGta() = audioPlayer.playGta()
    fun playCoffin() = audioPlayer.playCoffin()
    fun playJ() = audioPlayer.playJ()

}