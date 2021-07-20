package com.alvayonara.mamanga.ui.dashboard

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.transition.Slide
import androidx.transition.TransitionManager
import com.alvayonara.mamanga.R
import com.alvayonara.mamanga.core.base.BaseActivity
import com.alvayonara.mamanga.core.utils.gone
import com.alvayonara.mamanga.core.utils.visible
import com.alvayonara.mamanga.databinding.ActivityDashboardBinding
import com.alvayonara.mamanga.ui.detail.DetailMangaFragment
import com.google.android.material.navigation.NavigationBarView

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(),
    NavigationBarView.OnItemSelectedListener {

    override val bindingInflater: (LayoutInflater) -> ActivityDashboardBinding
        get() = ActivityDashboardBinding::inflate

    private var _navController: NavController? = null

    override fun setup() {
        setupView()
    }

    override fun setupView() {
        _navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        binding.navView.setOnItemSelectedListener(this)
        binding.navView.selectedItemId = R.id.action_dashboard

//        supportFragmentManager.registerFragmentLifecycleCallbacks(object :
//            FragmentManager.FragmentLifecycleCallbacks() {
//            override fun onFragmentViewCreated(
//                fm: FragmentManager,
//                f: Fragment,
//                v: View,
//                savedInstanceState: Bundle?
//            ) {
//                TransitionManager.beginDelayedTransition(
//                    binding.root,
//                    Slide(Gravity.BOTTOM).excludeTarget(R.id.nav_host_fragment, true)
//                )
//                when (f) {
//                    is DetailMangaFragment -> binding.navView.gone()
//                    else -> binding.navView.visible()
//                }
//            }
//        }, true)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_dashboard -> _navController?.navigate(R.id.navigation_dashboard)
            R.id.action_discover -> _navController?.navigate(R.id.navigation_discover)
            R.id.action_favorite -> _navController?.navigate(R.id.navigation_favorite)
            R.id.action_history -> _navController?.navigate(R.id.navigation_history)
            R.id.action_more -> _navController?.navigate(R.id.navigation_more)
        }
        return true
    }
}