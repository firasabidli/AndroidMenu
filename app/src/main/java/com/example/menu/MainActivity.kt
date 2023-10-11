package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

import android.view.ContextMenu

import android.view.View
import android.widget.TextView



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text_view)
        registerForContextMenu(textView)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater:MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.profile -> {
                Toast.makeText(this, "Profile sélectionnée", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.setting -> {
                Toast.makeText(this, "Setting sélectionnée", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.logout -> {
                Toast.makeText(this, "Logout sélectionnée", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }


    }








        override fun onCreateContextMenu(
            menu: ContextMenu?,
            v: View?,
            menuInfo: ContextMenu.ContextMenuInfo?
        ) {
            super.onCreateContextMenu(menu, v, menuInfo)
            menu?.setHeaderTitle("choose your option")
            menuInflater.inflate(R.menu.contextmenu, menu)
        }

        override fun onContextItemSelected(item: MenuItem): Boolean {
            val textView = findViewById<TextView>(R.id.text_view)

            when (item.itemId) {
                R.id.option1 -> {

                    textView.setBackgroundColor(resources.getColor(R.color.yellow))
                    return true
                }
                R.id.option2 -> {

                    textView.setBackgroundColor(resources.getColor(R.color.pink))
                    return true
                }

                R.id.option3 -> {

                    textView.setBackgroundColor(resources.getColor(R.color.red))
                    return true
                }



                else -> {

                    textView.setBackgroundColor(resources.getColor(android.R.color.transparent))
                    return super.onContextItemSelected(item)
                }
            }
        }

    }
