package com.example.contacts

import android.app.Activity
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ContactAdapter(val context: Activity, val list: Array<Contact>): ArrayAdapter<Contact>(context, R.layout.list_item, list) {
    
   override fun getView(position: Int, converView: View?, parent: ViewGroup): View {
       
       val inflater: LayoutInflater = LayoutInflater.from(context)
       val view: View = inflater.inflate(R.layout.list_item, null)

       val name: TextView = view.findViewById(R.id.contactName)
       val number: TextView = view.findViewById(R.id.contactNumber)

       name.text = list[position].name
       number.text = list[position].number

       return view
   }
}
