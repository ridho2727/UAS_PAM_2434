package com.example.ridho.ligainggris.adapter

import android.content.Context
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ridho.ligainggris.activity.detail.DetailActivity
import com.example.ridho.ligainggris.model.Pertandingan
import com.example.ridho.ligainggris.R
import kotlinx.android.synthetic.main.match_item.view.*
import org.jetbrains.anko.startActivity

class TimAdapter(private val eventList:List<Pertandingan>, val context: Context): RecyclerView.Adapter<TimAdapter.ClubViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubViewHolder {
        return ClubViewHolder(LayoutInflater.from(context).inflate(R.layout.match_item, parent, false))
    }

    override fun getItemCount(): Int = eventList.size


    override fun onBindViewHolder(holder: ClubViewHolder, position: Int) {
        holder.bind(eventList[position])
    }

    inner class ClubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(event: Pertandingan){
            if(event.intHomeScore == null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    itemView.Tv_dateSchedule.setTextColor(context.getColor(R.color.colorAccent))
                }
            }
            itemView.Tv_dateSchedule.text = event.dateEvent
            itemView.Tv_homeName.text = event.strHomeTeam
            itemView.Tv_homeScore.text = event.intHomeScore
            itemView.Tv_awayName.text = event.strAwayTeam
            itemView.Tv_awayScore.text = event.intAwayScore


            itemView.setOnClickListener {
                itemView.context.startActivity<DetailActivity>("match" to event)
            }
        }
    }

}

