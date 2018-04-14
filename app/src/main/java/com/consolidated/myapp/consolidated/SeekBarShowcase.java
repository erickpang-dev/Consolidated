package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarShowcase extends Activity {

    private SeekBar seekBar;
    private TextView resultsText;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_showcase);
        seekBar = findViewById(R.id.seekBarId);
        resultsText = findViewById(R.id.resultsTextId);
        returnButton = findViewById(R.id.returnButtonId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                resultsText.setText("SeekBar is now set to: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarShowcase.this, "SeekBar start touch detected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarShowcase.this, "SeekBar stop touch detected", Toast.LENGTH_SHORT).show();
            }
        });
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
