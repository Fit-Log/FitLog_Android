package app.yunho.fitlog_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class JoinNameAgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_name_age)

        val btnNext: Button = findViewById(R.id.btn_next)

        btnNext.setOnClickListener { View.OnClickListener {
            val intent = Intent(this, JoinWeightHeightActivity::class.java)
            startActivity(intent)
        } }
    }
}