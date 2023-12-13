package app.yunho.fitlog_android

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {

    private val etId: EditText by lazy { findViewById(R.id.et_id) }
    private val etPassword: EditText by lazy { findViewById(R.id.et_password) }
    private val btnLogin: Button by lazy { findViewById(R.id.btn_login) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etId.setOnClickListener {
            setEditTextBackground(etId, R.drawable.btn_selected)
            setEditTextBackground(etPassword, R.drawable.btn_unselected)
        }

        etPassword.setOnClickListener {
            setEditTextBackground(etPassword, R.drawable.btn_selected)
            setEditTextBackground(etId, R.drawable.btn_unselected)
        }
    }

    private fun setEditTextBackground(editText: EditText, drawableResId: Int) {
        val drawable: Drawable? = ContextCompat.getDrawable(this, drawableResId)
        editText.background = drawable
    }

    private fun updateLoginButtonBackground(){
        if(etId.text.isNotBlank() && etPassword.text.isNotBlank()){
            btnLogin.setBackgroundResource(R.drawable.btn_selected)
        }
    }
}
