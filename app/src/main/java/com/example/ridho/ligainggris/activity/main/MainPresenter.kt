package com.example.ridho.ligainggris.activity.main

import com.example.ridho.ligainggris.model.getPertandingan
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainPresenter(val mView : MainView.View, val getPertandingan: getPertandingan) : MainView.Presenter {

    val compositeDisposable = CompositeDisposable()

    override fun getYangAkanDatang() {
        mView.showLoading()
        compositeDisposable.add(getPertandingan.getYangAkanDatang("4328")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe{
                    mView.displayFootballMatch(it.events)
                    mView.hideLoading()
                })
    }

    override fun getYangLalu() {
        mView.showLoading()
        compositeDisposable.add(getPertandingan.getYangLalu("4328")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe{
                    mView.displayFootballMatch(it.events)
                    mView.hideLoading()
                })
    }

    override fun getFavoriteData() {
        mView.showLoading()
        compositeDisposable.add(getPertandingan.getYangLalu("4328")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe{
                    mView.displayFootballMatch(it.events)
                    mView.hideLoading()

                })
    }
}