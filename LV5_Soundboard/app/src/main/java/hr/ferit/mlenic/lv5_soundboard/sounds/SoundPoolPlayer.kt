package hr.ferit.mlenic.lv5_soundboard.sounds

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.SoundPool
import hr.ferit.mlenic.lv5_soundboard.R

class SoundPoolPlayer(context: Context): AudioPlayer {

    private val soundPool: SoundPool
    private val gtaSound: Int
    private val coffinSound: Int
    private val jSound: Int

    private val maxStreams: Int = 3
    private val priority: Int = 1
    private val srcQuality: Int = 1
    private val leftVolume = 1f
    private val righVolume = 1f
    private val shouldLoop = 0
    private val playbackRate = 1f


    init {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP){
            val audioAttributes = AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .setUsage(AudioAttributes.USAGE_GAME)
                .build()
            soundPool = SoundPool.Builder()
                .setAudioAttributes(audioAttributes)
                .setMaxStreams(maxStreams)
                .build()
        }

        else{
            soundPool = SoundPool(maxStreams, AudioManager.USE_DEFAULT_STREAM_TYPE, srcQuality)
        }

        gtaSound = soundPool.load(context, R.raw.gta, priority)
        coffinSound = soundPool.load(context, R.raw.coffindance, priority)
        jSound = soundPool.load(context, R.raw.jisooscared, priority)
    }

    override fun playGta() {
        soundPool.play(gtaSound, leftVolume, righVolume, priority, shouldLoop, playbackRate)
    }

    override fun playCoffin() {
        soundPool.play(coffinSound, leftVolume, righVolume, priority, shouldLoop, playbackRate)
    }

    override fun playJ() {
        soundPool.play(jSound, leftVolume, righVolume, priority, shouldLoop, playbackRate)
    }

}