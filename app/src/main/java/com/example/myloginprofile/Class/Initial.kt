package com.example.myloginprofile.Class

import android.app.Application
import com.example.myloginprofile.R
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

/**
 * Created by warun on 06/10/2017.
 */

class Initial : Application() {

    override fun onCreate() {
        super.onCreate()

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSans-Light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build())
    }

}