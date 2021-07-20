package com.alvayonara.mamanga.ui.dashboard

import android.view.LayoutInflater
import com.alvayonara.mamanga.core.base.BaseActivity
import com.alvayonara.mamanga.databinding.ActivityDashboardBinding

class DashboardActivity : BaseActivity<ActivityDashboardBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityDashboardBinding
        get() = ActivityDashboardBinding::inflate

    override fun setup() {
        setupView()
    }

    override fun setupView() {
    }
}