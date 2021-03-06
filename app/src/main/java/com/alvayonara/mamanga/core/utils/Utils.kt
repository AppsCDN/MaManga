package com.alvayonara.mamanga.core.utils

import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun Fragment.navigate(action: NavDirections) {
    this.view?.let { Navigation.findNavController(it).navigate(action) }
}

fun Fragment.navigateUp() {
    this.view?.let { Navigation.findNavController(it).navigateUp() }
}