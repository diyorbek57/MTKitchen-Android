package uz.maxtac.mtkitchen.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.maxtac.mtkitchen.R
import uz.maxtac.mtkitchen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.bottomNavigationView.background = null  //Removing the background shadow
        binding.bottomNavigationView.menu.getItem(2).isEnabled = false
    }
}