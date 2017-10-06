package com.example.myloginprofile.Class

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.view.ViewCompat
import android.view.View

/**
 * Created by warun on 06/10/2017.
 */
class MyTransition(private val activity: Activity) {

    fun sharedElement(view: View): Bundle {
        var options: ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, view, ViewCompat.getTransitionName(view))
        return options.toBundle()
    }
}