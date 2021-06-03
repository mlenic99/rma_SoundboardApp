package hr.ferit.mlenic.lv5_soundboard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.ferit.mlenic.lv5_soundboard.databinding.ActivitySoundboardBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SoundBoardActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySoundboardBinding
    private val viewModel by viewModel<SoundBoardViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoundboardBinding.inflate(layoutInflater).also {
            setContentView(it.root)
            it.ibGta.setOnClickListener { gtaSound() }
            it.ibCoffin.setOnClickListener { coffinSound() }
            it.ibJ.setOnClickListener { jSound() }
        }

    }

    private fun jSound() {
        viewModel.playJ()
    }

    private fun coffinSound() {
        viewModel.playCoffin()
    }

    private fun gtaSound() {
        viewModel.playGta()
    }
}