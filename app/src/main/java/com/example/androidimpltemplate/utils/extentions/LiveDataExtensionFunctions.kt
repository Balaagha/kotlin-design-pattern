package com.example.androidimpltemplate.utils.extentions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer


fun <T : Any, L : LiveData<T>> LifecycleOwner.observe(
    liveData: L, observer: (T?) -> Unit
) {
    return liveData.observe(this, Observer(observer))
}


