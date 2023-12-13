package app.yunho.fitlog_android

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.widget.SeekBar


@SuppressLint("AppCompatCustomView")
class CircularSeekBar : SeekBar {
    private var paint: Paint? = null

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init()
    }

    private fun init() {
        paint = Paint()
        paint!!.isAntiAlias = true
        paint!!.style = Paint.Style.STROKE
        paint!!.strokeWidth = 30f
        paint!!.color = resources.getColor(R.color.white)
    }

    @SuppressLint("DrawAllocation")
    @Synchronized
    override fun onDraw(canvas: Canvas) {
        val centerX = width / 2
        val centerY = height / 2
        val radius = centerX.coerceAtMost(centerX) - 20
        val rectF = RectF(
            (centerX - radius).toFloat(),
            (centerY - radius).toFloat(),
            (centerX + radius).toFloat(),
            (centerY + radius).toFloat(),
        )
        val angle = (0 + 360 * progress / max).toFloat()
        canvas.drawArc(rectF, 90f, angle, false, paint!!, )
    }
}