//package com.example.ridho.ligainggris.Fragment
//
//import android.os.Bundle
//import android.support.v4.app.Fragment
//import android.support.v4.view.PagerAdapter
//import android.support.v7.app.AppCompatActivity
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.example.achmad.FootballMatchScheduleVer1.R
//import com.example.ridho.ligainggris.R
//import com.example.ridho.ligainggris.adapter.PageAdapter
//
//class FragmentFavorit : Fragment() {
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_favorit, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        setupEnv()
//    }
//
//    private fun setupEnv() {
//        with(activity as AppCompatActivity) {
//            setSupportActionBar(toolbar)
//
//            view_pager.adapter = PageAdapter(supportFragmentManager,
//                    mapOf(
//                            getString(R.string.title_matches).capitalize() to FavoritesTabsFragment.newInstance(TypeFavorites.MATCHES),
//                    )
//            )
//            tab_layout.setupWithViewPager(view_pager)
//        }
//    }
//}