package com.oddinstitute.simplecanvasdrawing

import android.content.Context
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.view.View
import android.widget.FrameLayout

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawView = DrawView(this)
        findViewById<FrameLayout>(R.id.canvasId).addView(drawView)
    }
}


class DrawView(context: Context) : View(context)
{
    var paint: Paint = Paint()
    var path: Path = Path()

    override fun onDraw(canvas: Canvas)
    {
        paint.color = Color.RED
        paint.style = Paint.Style.FILL

        path.moveTo(20f, 20f)
        path.lineTo(200f, 200f)
        path.lineTo(200f, 300f)
        path.close()

        canvas.drawPath(path, paint)
    }
}








