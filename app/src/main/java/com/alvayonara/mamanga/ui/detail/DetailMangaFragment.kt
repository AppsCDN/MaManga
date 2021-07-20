package com.alvayonara.mamanga.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import com.alvayonara.mamanga.core.base.BaseFragment
import com.alvayonara.mamanga.databinding.FragmentDetailMangaBinding

class DetailMangaFragment : BaseFragment<FragmentDetailMangaBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentDetailMangaBinding
        get() = FragmentDetailMangaBinding::inflate

    override fun setup() {
    }
}