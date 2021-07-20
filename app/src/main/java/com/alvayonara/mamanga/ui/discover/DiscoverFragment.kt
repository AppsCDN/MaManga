package com.alvayonara.mamanga.ui.discover

import android.view.LayoutInflater
import android.view.ViewGroup
import com.alvayonara.mamanga.core.base.BaseFragment
import com.alvayonara.mamanga.databinding.FragmentDiscoverBinding

class DiscoverFragment : BaseFragment<FragmentDiscoverBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentDiscoverBinding
        get() = FragmentDiscoverBinding::inflate

    override fun setup() {
    }
}