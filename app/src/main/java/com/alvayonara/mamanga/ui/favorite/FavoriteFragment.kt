package com.alvayonara.mamanga.ui.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import com.alvayonara.mamanga.core.base.BaseFragment
import com.alvayonara.mamanga.databinding.FragmentFavoriteBinding

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentFavoriteBinding
        get() = FragmentFavoriteBinding::inflate

    override fun setup() {
    }
}