package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MediaPlayerShowcase extends Activity {

    private ToggleButton playPauseButton;
    private Button stopButton, returnButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player_showcase);

        playPauseButton = findViewById(R.id.playPauseButtonId);
        stopButton = findViewById(R.id.stopButtonId);
        returnButton = findViewById(R.id.returnButtonId);

        playPauseButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    mediaPlayer = MediaPlayer.create(MediaPlayerShowcase.this, R.raw.elevatormusic);
                    mediaPlayer.start();
                } else {
                    mediaPlayer.pause();
                }
            }
        });
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    playPauseButton.setChecked(false);
                }
            }
        });
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MediaPlayerShowcase.this,"Going back.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}
