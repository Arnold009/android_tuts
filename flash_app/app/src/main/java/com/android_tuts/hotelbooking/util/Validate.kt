package com.android_tuts.hotelbooking.util

import android.util.Patterns
import android.widget.TextView

class Validate(private val tv: TextView) {

    fun isEmpty(msg: String): Validate {
        if (tv.text.isEmpty())
            throw ValidateException(msg)
        tv.requestFocus()
        return this
    }

    fun isEmptyWithTrim(msg: String): Validate {
        if (tv.text.toString().trim().isEmpty())
            throw ValidateException(msg)
        tv.requestFocus()
        return this
    }

    fun minLen(msg: String, size: Int): Validate {
        if (tv.text.toString().length > size)
            throw ValidateException(msg)
        tv.requestFocus()
        return this
    }

    fun checkEmail(msg: String): Validate {
        if (!tv.text.toString().matches(Patterns.EMAIL_ADDRESS.toRegex()))
            throw ValidateException(msg)
        tv.requestFocus()
        return this
    }

    fun compare(tvc: TextView, msg: String): Validate {
        if (tvc.text.toString() != tv.text.toString())
            throw ValidateException(msg)
        tvc.requestFocus()
        return this
    }

}