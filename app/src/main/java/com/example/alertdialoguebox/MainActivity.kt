package com.example.alertdialoguebox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure?")
            builder1.setMessage("Do you want to Close the App")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }
        binding.button2.setOnClickListener{
            val options = arrayOf("Gulab Jamun","Rasmalai", "Jalebi")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite dessert")
            builder2.setSingleChoiceItems(options,0, DialogInterface.OnClickListener { dialog, which ->
                //what action should be performed when user clicked on this
                Toast.makeText(this,"you clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }
        binding.button3.setOnClickListener{
            val options = arrayOf("Gulab Jamun","Rasmalai", "Jalebi")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite dessert")
            builder2.setMultiChoiceItems(options,null, DialogInterface.OnMultiChoiceClickListener { dialog, which,isChecked ->
                //what action should be performed when user clicked on this
                Toast.makeText(this,"you clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()

        }
    }
}