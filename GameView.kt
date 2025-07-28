package com.example.ludojackaroo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class GameView(context: Context) : View(context) {
    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.WHITE)
        paint.color = Color.BLUE
        paint.style = Paint.Style.STROKE
        canvas.drawRect(100f, 100f, 600f, 600f, paint)
    }
}