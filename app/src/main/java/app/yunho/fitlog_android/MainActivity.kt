package app.yunho.fitlog_android

import android.app.ActivityManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import app.yunho.fitlog_android.databinding.ActivityMainBinding
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

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

        binding.ivLogo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val radius = resources.getDimension(R.dimen.radius_small)
        val bottomNavigationViewBackground = binding.bnvBottomNavigation.background as MaterialShapeDrawable
        bottomNavigationViewBackground.shapeAppearanceModel =
            bottomNavigationViewBackground.shapeAppearanceModel.toBuilder()
                .setTopRightCorner(CornerFamily.ROUNDED, radius)
                .setTopLeftCorner(CornerFamily.ROUNDED, radius)
                .build()

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val activityManager = getSystemService(ACTIVITY_SERVICE) as ActivityManager
                val appTasks = activityManager.appTasks
                for (task in appTasks) {
                    task.finishAndRemoveTask()
                }
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)
    }

    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val currentDate = Calendar.getInstance().time
        return dateFormat.format(currentDate)
    }
}
