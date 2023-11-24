package com.androidcenter.viewpageronboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.androidcenter.viewpageronboarding.fragments.FinalPageFragment
import com.androidcenter.viewpageronboarding.fragments.FirstPageFragment
import com.androidcenter.viewpageronboarding.fragments.SecondPageFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager, lifecycle) {
    private val pageCount=3
    override fun getItemCount(): Int {
        return pageCount
    }

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0-> FirstPageFragment()
            1-> SecondPageFragment()
            2-> FinalPageFragment()
            else-> null
        }!!
    }

}
