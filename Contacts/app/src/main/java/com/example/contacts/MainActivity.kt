package com.example.contacts

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts: Array<Contact> = arrayOf(
            Contact("John Doe", "98765 43210"),
            Contact("Jane Smith", "87654 32109"),
            Contact("Alice Johnson", "76543 21098"),
            Contact("Bob Williams", "65432 10987"),
            Contact("Eva Brown", "54321 09876"),
            Contact("Sam Wilson", "43210 98765"),
            Contact("Lily Davis", "32109 87654"),
            Contact("Max Cooper", "21098 76543"),
            Contact("Sophia Lee", "10987 65432"),
            Contact("Daniel White", "09876 54321"),
            Contact("Olivia Taylor", "98765 43210"),
            Contact("Michael Johnson", "87654 32109")
        )

        val adapter = ContactAdapter(this, contacts)
        findViewById<ListView>(R.id.listView).adapter = adapter
    }
}