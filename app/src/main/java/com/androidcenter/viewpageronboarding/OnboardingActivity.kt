package com.androidcenter.viewpageronboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.CompositePageTransformer
import com.androidcenter.viewpageronboarding.databinding.ActivityOnboardingBinding
import com.google.android.material.tabs.TabLayoutMediator

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding:ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_onboarding)
        setPager()
    }

    private fun setPager() {
        val pager = binding.sliderPager
        val tabLayout=binding.tabLayout
        val pagerAdapter=ViewPagerAdapter(supportFragmentManager,lifecycle)
        val compositePageTransformer= CompositePageTransformer()
        pager.clipToPadding=false
        pager.clipChildren=false
        pager.offscreenPageLimit=3
        pager.setPageTransformer(compositePageTransformer)
        pager.adapter=pagerAdapter

        TabLayoutMediator(tabLayout,pager){tab,position->
            // add some click action according to page position
        }.attach()
    }
}