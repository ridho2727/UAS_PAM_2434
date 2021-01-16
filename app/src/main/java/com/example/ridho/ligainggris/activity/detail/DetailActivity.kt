package com.example.ridho.ligainggris.activity.detail

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.ridho.ligainggris.api.Api
import com.example.ridho.ligainggris.api.ApiInterface
import com.example.ridho.ligainggris.model.Pertandingan
import com.example.ridho.ligainggris.model.getPertandingan
import com.example.ridho.ligainggris.model.TimBola
import com.example.ridho.ligainggris.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity(), DetailView.View {

    override  fun displayBadgeLiga(liga: Pertandingan){
        Picasso.get()
                .load(liga.strThumb)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(img_badge)
    }

    override fun displayTeamBadgeAway(timBola: TimBola) {
        Picasso.get()
                .load(timBola.strTeamBadge)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(img_away)
    }

    override fun displayTeamBadgeHome(timBola: TimBola) {

        Picasso.get()
                .load(timBola.strTeamBadge)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(img_home)
    }

    private lateinit var mPresenter: DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val service = Api.getClient().create(ApiInterface::class.java)
        val request = getPertandingan(service)
        mPresenter = DetailPresenter(this, request)

        val event = intent.getParcelableExtra<Pertandingan>("match")
        mPresenter.getTeamsBadgeAway(event.idAwayTeam)
        mPresenter.getTeamsBadgeHome(event.idHomeTeam)
        initData(event)
        supportActionBar?.title = event.strEvent
    }

    private fun initData(pertandingan: Pertandingan) {
        if (pertandingan.intHomeScore == null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                tv_match_date.setTextColor(applicationContext.getColor(R.color.colorAccent))
            }
        }
        tv_match_date.text = pertandingan.dateEvent
        home_score_match.text = pertandingan.intHomeScore
        away_score_match.text = pertandingan.intAwayScore
        home_name.text = pertandingan.strHomeTeam
        away_name.text = pertandingan.strAwayTeam
        tv_tmpt_venue.text = pertandingan.strVenue
        tv_kick_off.text = pertandingan.strTime
        tv_status.text = pertandingan.strStatus
    }


}