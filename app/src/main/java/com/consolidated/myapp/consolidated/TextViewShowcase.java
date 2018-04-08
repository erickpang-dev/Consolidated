package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TextViewShowcase extends Activity {

    private Button returnButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_showcase);

        returnButton = findViewById(R.id.returnButtonId);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TextViewShowcase.this,"Going back.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
