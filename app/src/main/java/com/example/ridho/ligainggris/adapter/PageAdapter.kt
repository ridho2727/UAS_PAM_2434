//package com.example.ridho.ligainggris.adapter
//
//import android.app.FragmentManager
//import android.support.v4.app.Fragment
//import android.support.v4.app.FragmentStatePagerAdapter
//
//class PageAdapter(supportFragmentManager: FragmentManager, private  val map: Map<String, Fragment>) : FragmentStatePagerAdapter(supportFragmentManager){
//
//    private val titles = map.keys.toList()
//    private val fragments = map.values.toList()
//
//    override fun getItem(position: Int): Fragment = fragments[position]
//
//    override fun getCount(): Int = map.size
//
//    override fun getPageTitle(position: Int): CharSequence? = titles[position]
//
//}