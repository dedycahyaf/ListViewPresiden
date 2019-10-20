package com.example.listviewpresiden

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class ListPresidenAdapter (var ListPresiden :Context, var Data:Int, var items:List<Presiden>):
    ArrayAdapter<Presiden>(ListPresiden, Data, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(ListPresiden)
        val view:View = layoutInflater.inflate(Data, null)

        val imageView:ImageView = view.findViewById(R.id.image)
        val titleTextView:TextView = view.findViewById(R.id.textView1)
        val descritionTextView:TextView = view.findViewById(R.id.textView2)

        var mItem:Presiden = items[position]
        imageView.setImageDrawable(ListPresiden.resources.getDrawable(mItem.image))
        titleTextView.text = mItem.nama
        descritionTextView.text = mItem.detel


        return view
    }
}