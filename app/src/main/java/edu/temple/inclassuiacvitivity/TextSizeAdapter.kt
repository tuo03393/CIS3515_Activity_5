package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val _numbers: Array<Int>, private val c: Context) : BaseAdapter() {

    override fun getCount() = _numbers.size

    override fun getItem(position: Int) = _numbers[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?, left: Int): View {
        val textView : TextView

        if (convertView == null) {
            textView = TextView(c)
        } else {
            textView = (convertView as TextView)
        }

        textView.text = _numbers[position].toString()
        return textView

        }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?, left: Int): View {
        val textView = (getView(position, convertView, parent) as TextView)
        textView.textSize = _numbers[position].toFloat()
        return textView
    }



}