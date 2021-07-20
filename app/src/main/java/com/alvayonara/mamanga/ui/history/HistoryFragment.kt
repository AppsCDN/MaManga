package com.alvayonara.mamanga.ui.history

import android.view.LayoutInflater
import android.view.ViewGroup
import com.alvayonara.mamanga.core.base.BaseFragment
import com.alvayonara.mamanga.databinding.FragmentHistoryBinding

class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHistoryBinding
        get() = FragmentHistoryBinding::inflate

    override fun setup() {
    }
}