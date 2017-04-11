package com.example.android.inclassassignment10_katieb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SingularEpisodeView extends AppCompatActivity {

    private ImageView image;
    private TextView title;
    private TextView seasons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singular_episode_view);

        image = (ImageView) findViewById(R.id.single_photo);
        title = (TextView) findViewById(R.id.single_name);
        seasons = (TextView) findViewById(R.id.single_season);

        Intent intent = getIntent();
        Episode e = (Episode) intent.getSerializableExtra(Keys.EPISODE);

        image.setImageResource(e.getPhotoID());
        title.setText(e.getName());
        seasons.setText(e.getInfo());

    }
}
