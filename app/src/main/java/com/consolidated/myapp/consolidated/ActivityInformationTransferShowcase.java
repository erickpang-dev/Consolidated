package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityInformationTransferShowcase extends Activity {

    private EditText userInput;
    private Button sendButton, returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_transfer_showcase);

        userInput = findViewById(R.id.userInputTextId);
        sendButton = findViewById(R.id.sendButtonId);
        returnButton = findViewById(R.id.returnButtonId);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userInput != null){
                    String sendText = userInput.getText().toString();
                    Intent hiddenActivity = new Intent(ActivityInformationTransferShowcase.this, HiddenActivity.class);
                    hiddenActivity.putExtra("textTransfer",sendText);
                    startActivity(hiddenActivity);

                }
            }
        });

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityInformationTransferShowcase.this,"Going back.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}
