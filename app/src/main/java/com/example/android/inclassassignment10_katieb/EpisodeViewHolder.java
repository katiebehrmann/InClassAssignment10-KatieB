package com.example.android.inclassassignment10_katieb;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by katie on 4/10/17.
 */

public class EpisodeViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView episodeTitle;
    public TextView episodeSeason;
    public ImageView episodePhoto;
    private Context context;

    public EpisodeViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        episodeTitle = (TextView) itemView.findViewById(R.id.episode_name);
        episodeSeason = (TextView) itemView.findViewById(R.id.episode_season);
        episodePhoto = (ImageView) itemView.findViewById(R.id.episode_photo);
        this.context = context;
    }

    public void bind(final Episode episode) {
        episodeTitle.setText(episode.name);
        episodeSeason.setText(episode.info);
        episodePhoto.setImageResource(episode.photoID);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Episode e = new Episode(episode.name, episode.info, episode.photoID);
                Intent intent = new Intent(context, SingularEpisodeView.class);
                intent.putExtra(Keys.EPISODE, e);
                context.startActivity(intent);

                Toast.makeText(context, episodeTitle.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}