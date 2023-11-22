package app.yunho.fitlog_android

import android.content.Intent
import android.icu.util.LocaleData
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.yunho.fitlog_android.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivPlaylist.setOnClickListener {
            val youtubeLink = "https://www.youtube.com/watch?v=JsOOis4bBFg"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeLink))
            startActivity(intent)
        }

        val currentDate = getCurrentDate()

        binding.tvDate.text = currentDate
    }

    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val currentDate = Calendar.getInstance().time
        return dateFormat.format(currentDate)
    }
}