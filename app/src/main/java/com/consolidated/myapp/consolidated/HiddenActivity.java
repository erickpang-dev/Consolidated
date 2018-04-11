package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HiddenActivity extends Activity {

    private TextView receivedText;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden);

        receivedText = findViewById(R.id.receivedTextId);
        returnButton = findViewById(R.id.returnButtonId);

        Bundle retrieveExtra = getIntent().getExtras();

        if ( retrieveExtra != null) {
            String getText = retrieveExtra.getString("textTransfer");
            receivedText.setText(getText);
        }




        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HiddenActivity.this,"Going back.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });



    }
}
