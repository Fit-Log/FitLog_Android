package app.yunho.fitlog_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class JoinIdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_id)

        val btnNext: Button = findViewById(R.id.btn_next)

        btnNext.setOnClickListener {
            View.OnClickListener {
                val intent = Intent(this, JoinPasswordActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

