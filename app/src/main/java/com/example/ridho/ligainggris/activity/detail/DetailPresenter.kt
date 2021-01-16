package com.example.ridho.ligainggris.activity.detail

import com.example.ridho.ligainggris.model.getPertandingan
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DetailPresenter(val mView : DetailView.View, val getPertandingan: getPertandingan) : DetailView.Presenter {

    override fun getBadgeLiga(id: String) {
        compositeDisposable.add(getPertandingan.getYangLalu(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe{
                    mView.displayBadgeLiga(it.events[0])
                })
    }

    override fun getTeamsBadgeHome(id: String) {
        compositeDisposable.add(getPertandingan.getTim(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe{
                    mView.displayTeamBadgeHome(it.timBolas[0])
                })
    }

    val compositeDisposable = CompositeDisposable()

    override fun getTeamsBadgeAway(id:String) {
        compositeDisposable.add(getPertandingan.getTim(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe{
                    mView.displayTeamBadgeAway(it.timBolas[0])
                })
    }
}