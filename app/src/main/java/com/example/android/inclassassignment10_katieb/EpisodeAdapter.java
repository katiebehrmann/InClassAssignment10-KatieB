package com.example.android.inclassassignment10_katieb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by katie on 4/10/17.
 */

public class EpisodeAdapter extends RecyclerView.Adapter<EpisodeViewHolder> {

    private List<Episode> episodes;
    private Context context;

    public EpisodeAdapter(List<Episode> episodes, Context context) {
        this.episodes = episodes;
        this.context = context;
    }

    @Override
    public EpisodeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_episode, parent, false);
        return new EpisodeViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(EpisodeViewHolder holder, int position) {
        Episode episode = episodes.get(position);
        holder.bind(episode);
    }

    @Override
    public int getItemCount() {
        return episodes.size();
    }
}
