package com.alvayonara.mamanga.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import com.alvayonara.mamanga.core.base.BaseFragment
import com.alvayonara.mamanga.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment<FragmentDashboardBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentDashboardBinding
        get() = FragmentDashboardBinding::inflate

    override fun setup() {
    }
}