package com.alvayonara.mamanga.core.utils

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

object Helper {

    fun setToast(message: String, context: Context) =
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    fun hideKeyboard(act: Activity) {
        val view = act.currentFocus
        if (view != null) {
            val inputMethodManager =
                act.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}