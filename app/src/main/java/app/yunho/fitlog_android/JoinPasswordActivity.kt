package app.yunho.fitlog_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class JoinPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_password)

        val btnNext: Button = findViewById(R.id.btn_next)

        btnNext.setOnClickListener {
            View.OnClickListener {
                val intent = Intent(this, JoinNameAgeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}