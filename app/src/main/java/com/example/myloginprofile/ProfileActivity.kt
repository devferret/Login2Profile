package com.example.myloginprofile

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.util.Log.e
import android.view.View
import android.widget.ImageView
import com.example.myloginprofile.Class.MyTransition
import com.github.babedev.dexter.dsl.runtimePermission
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.button
import org.jetbrains.anko.find
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.verticalLayout

/**
 * Created by warun on 06/10/2017.
 */

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var imgProfile = find<ImageView>(R.id.imgProfile)
        var btnCall = find<FloatingActionButton>(R.id.btnCall)

        imgProfile.onClick {
            // startActivity(Intent(this@ProfileActivity, LoginActivity::class.java), MyTransition(this@ProfileActivity).sharedElement(imgProfile))
            // this@ProfileActivity.finish()
            onBackPressed()
        }
        btnCall.onClick {
            intent(Intent.ACTION_CALL)
        }
    }

    private fun intent(action: String) {
        var intent = Intent(action).setData(Uri.parse("tel:" + "0824976248"))
        runtimePermission {
            permission(Manifest.permission.CALL_PHONE) {
                granted {
                    startActivity(intent)
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finishAfterTransition()
        return true
    }
}