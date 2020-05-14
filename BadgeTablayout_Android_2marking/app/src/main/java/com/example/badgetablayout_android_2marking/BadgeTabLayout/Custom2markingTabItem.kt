package com.example.badgetablayout_android_2marking.BadgeTabLayout

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import com.example.badgetablayout_android_2marking.R

class Custom2markingTabItem(ctx: Context, attrs: AttributeSet? = null) : View(ctx, attrs) {
    var text:CharSequence? = null
    var icon:Drawable? = null

    init {
        attrs?.let {
            val a = ctx.obtainStyledAttributes(attrs, R.styleable.Custom2markingTabItem)
            text = a.getText(R.styleable.Custom2markingTabItem_android_text)
            icon = a.getDrawable(R.styleable.Custom2markingTabItem_android_icon)
            a.recycle()
        }
    }

}