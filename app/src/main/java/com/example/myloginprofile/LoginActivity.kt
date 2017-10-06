package com.example.myloginprofile

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.myloginprofile.Class.MyTransition
import org.jetbrains.anko.find
import org.jetbrains.anko.sdk25.coroutines.*
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper
import java.sql.Time


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

         val image = find<ImageView>(R.id.imageView)
         val button = find<Button>(R.id.button)
         var editText = find<EditText>(R.id.editText)
         var editTextPassword = find<EditText>(R.id.editText_password)

        button.onClick {
            if (validation(editText.text.toString(), editTextPassword.text.toString())) {
                startActivity(Intent(this@LoginActivity, ProfileActivity::class.java), MyTransition(this@LoginActivity).sharedElement(image))
                // this@LoginActivity.finish()

                editText.text.clear()
                editTextPassword.text.clear()
            } else {
                Toast.makeText(this@LoginActivity, "Incorrect !", Toast.LENGTH_LONG)
            }
        }
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    private fun validation(id: CharSequence, pass: CharSequence): Boolean {
        return (id == "letter_box@mail.com" || id == "0112223344") && pass == "f8w2f9e"
    }
}
