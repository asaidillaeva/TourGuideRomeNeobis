package com.example.tourguiderome

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CategoryAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!)  {

    override fun getPageTitle(position: Int): CharSequence? {
        return  when (position) {
            0 -> "Museums"
            1 -> "Parks"
            else -> "Restaurants"
        }

    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MuseumFragment()
            1 -> ParkFragment()
            else -> RestaurantFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}