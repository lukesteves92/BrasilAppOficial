package com.lucasesteves.brasilflixapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TipsVP (
    private val fragments: List<Fragment>,
    manager: FragmentManager
        ): FragmentPagerAdapter(manager){
    override fun getCount() = fragments.size

    override fun getItem(position: Int) = fragments[position]
        }