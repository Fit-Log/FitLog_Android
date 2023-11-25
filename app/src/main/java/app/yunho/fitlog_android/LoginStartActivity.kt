package app.yunho.fitlog_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.yunho.fitlog_android.databinding.ActivityLoginStartBinding

class LoginStartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
