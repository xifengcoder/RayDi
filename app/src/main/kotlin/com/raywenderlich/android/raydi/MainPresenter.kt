package com.raywenderlich.android.raydi

import com.raywenderlich.android.raydi.annotations.RayBind

@RayBind(IPresenter::class)
class MainPresenter : IPresenter {
    override fun refresh(s: String) {
        println("refresh s: $s")
    }
}