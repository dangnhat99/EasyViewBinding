package android.sms.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sms.daggerdemo.databinding.MainActivityBinding
import android.sms.ezviewbinding.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(MainActivityBinding:: inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txtHello.text = "Easy binding"
    }
}