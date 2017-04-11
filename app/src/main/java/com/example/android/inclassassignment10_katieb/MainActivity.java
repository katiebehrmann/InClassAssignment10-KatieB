package com.example.android.inclassassignment10_katieb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Episode> episodes;
    private EpisodeAdapter episodeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        episodeAdapter = new EpisodeAdapter(episodes, this);

        recyclerView.setAdapter(episodeAdapter);
    }

    public void addRandom(View view) {
        episodes.add(getRandomEpisode());
        episodeAdapter.notifyDataSetChanged();
    }

    private void initialData() {
        episodes = new ArrayList<>();
        episodes.add(new Episode("Faith, Hope, and Trick", "Season 3", R.drawable.buffyfaith));
        episodes.add(new Episode("Conversations with Dead People", "Season 7", R.drawable.cheese));
        episodes.add(new Episode("Tabula Rasa", "Season 5", R.drawable.tabularasa));
    }

    private Episode getRandomEpisode() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Episode("Faith, Hope, and Trick", "Season 3", R.drawable.buffyfaith);
        else if (num == 1)
            return new Episode("Conversations with Dead People", "Season 7", R.drawable.cheese);
        else
            return new Episode("Tabula Rasa", "Season 5", R.drawable.tabularasa);
    }



}
