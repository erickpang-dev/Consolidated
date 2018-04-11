package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ButtonShowcase extends Activity {

    private Button simpleButton, returnButton;
    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton selectedRadioButton;
    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_showcase);

        simpleButton = findViewById(R.id.simpleButtonId);
        returnButton = findViewById(R.id.returnButtonId);
        checkBox = findViewById(R.id.checkBoxId);
        radioGroup = findViewById(R.id.radioGroupId);
        toggleButton = findViewById(R.id.toggleButtonId);

        simpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonShowcase.this, "Button has been pressed", Toast.LENGTH_SHORT).show();
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()){
                    Toast.makeText(ButtonShowcase.this, "Checkbox has been checked.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ButtonShowcase.this, "Checkbox has been unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                selectedRadioButton = findViewById(i);
                Toast.makeText(ButtonShowcase.this, selectedRadioButton.getText().toString() + " has been selected", Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(ButtonShowcase.this, "Toggle button has been set on On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ButtonShowcase.this, "Toggle button has been set on Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonShowcase.this,"Going back.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });




    }
}
