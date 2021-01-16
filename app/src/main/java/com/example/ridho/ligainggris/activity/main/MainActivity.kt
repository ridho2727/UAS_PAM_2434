package com.example.ridho.ligainggris.activity.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.ridho.ligainggris.api.Api
import com.example.ridho.ligainggris.api.ApiInterface
import com.example.ridho.ligainggris.adapter.TimAdapter
import com.example.ridho.ligainggris.model.Pertandingan
import com.example.ridho.ligainggris.model.getPertandingan
import com.example.ridho.ligainggris.R
import com.example.ridho.ligainggris.R.id.*
import com.example.ridho.ligainggris.utils.invisible
import com.example.ridho.ligainggris.utils.visible
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger

class MainActivity : AppCompatActivity(), AnkoLogger, MainView.View {

    lateinit var mPresenter : MainPresenter

    private var matchLists : MutableList<Pertandingan> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val service = Api.getClient().create(ApiInterface::class.java)
        val request = getPertandingan(service)
        mPresenter = MainPresenter(this, request)
        mPresenter.getYangLalu()

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
              lastMatch -> {
                  mPresenter.getYangLalu()
                }
               nextMatch -> {

                   mPresenter.getYangAkanDatang()
                }
                favoriteMatch ->{
                    mPresenter.getFavoriteData()
                }

            }
            true
        }
        bottom_navigation.selectedItemId = lastMatch

    }

    override fun hideLoading() {
        mainProgressBar.invisible()
    }

    override fun showLoading() {
        mainProgressBar.visible()
    }

    override fun displayFootballMatch(matchList: List<Pertandingan>) {
        matchLists.clear()
        matchLists.addAll(matchList)
        val layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        rvFootball.layoutManager = layoutManager
        rvFootball.adapter = TimAdapter(matchList, applicationContext)
    }


}
