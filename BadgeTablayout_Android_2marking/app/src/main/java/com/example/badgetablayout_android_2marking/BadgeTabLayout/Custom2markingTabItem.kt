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
            val a = ctx.obtainStyledAttributes(attrs, R.styleable.FuckTabItem)
            text = a.getText(R.styleable.FuckTabItem_android_text)
            icon = a.getDrawable(R.styleable.FuckTabItem_android_icon)
            a.recycle()
        }
    }

}