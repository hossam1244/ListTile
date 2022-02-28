package com.hossam.list_tile

import androidx.constraintlayout.widget.ConstraintLayout

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.TextView
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.annotation.Nullable
import kotlinx.android.synthetic.main.list_tile_view.view.*

class ListTile(context: Context, @Nullable attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    private var view : View = LayoutInflater.from(context).inflate(R.layout.list_tile_view, this, true)
    private var imageView: ImageView
    private var titleTextView: TextView
    private var subtitleTextView: TextView
    private var imageDrawable : Drawable?
    private var title: String?
    private var subtitle: String?

    init {
        imageView = view.imageView as ImageView
        titleTextView = view.titleTextView as TextView
        subtitleTextView = view.subtitleTextView as TextView

        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0)

        try {
            imageDrawable = typedArray.getDrawable(R.styleable.CustomView_setImageDrawable)
            title = typedArray.getString(R.styleable.CustomView_setTitle)
            subtitle = typedArray.getString(R.styleable.CustomView_setSubTitle)

            imageView.setImageDrawable(imageDrawable)
            titleTextView.text = title
            subtitleTextView.text = subtitle
        }
        finally {
            typedArray.recycle()
        }

        /** Uncomment below line if all of your attribute fields are required.
         * Throw an exception if required attributes are not set. It will caused Run Time Exception.
         * In this sample project we assume that, no attributes are mandatory
         * *
         */
        /*
        if (imageDrawable == null)
            throw RuntimeException("No image drawable provided")
        if (title == null) {
            throw RuntimeException("No title provided")
        }
        if (subtitle == null) {
            throw RuntimeException("No subtitle provided")
        }*/
    }

    /**
     *  to access the attributes programmatically
     */

    fun setImageDrawable(drawable: Drawable?) {
        imageView.setImageDrawable(drawable)
    }
    fun getImageDrawable() : Drawable? {
        return imageDrawable
    }

    fun setTitle(text: String?) {
        titleTextView.text = text
    }
    fun getTitle() : String? {
        return title
    }

    fun setSubtitle(text: String?) {
        subtitleTextView.text = text
    }
    fun getSubtitle() : String? {
        return subtitle
    }
}