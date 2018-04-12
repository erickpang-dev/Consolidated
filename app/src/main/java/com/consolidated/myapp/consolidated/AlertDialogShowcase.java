package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogShowcase extends Activity {

    private Button alertDialogButton, returnButton;
    private AlertDialog.Builder alertDialogExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_showcase);

        alertDialogButton = findViewById(R.id.alertDialogButtonId);
        returnButton = findViewById(R.id.returnButtonId);

        alertDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogExample = new AlertDialog.Builder(AlertDialogShowcase.this);
                alertDialogExample.setMessage("This is the alert dialog message.");
                alertDialogExample.setTitle("This is the alert dialog title.");
                alertDialogExample.setPositiveButton("Positive",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertDialogShowcase.this, "You've clicked on the positive answer.", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialogExample.setNegativeButton("Negative",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(AlertDialogShowcase.this, "You've clicked on the negative answer", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialogExample.setCancelable(false);
                alertDialogExample.create();
                alertDialogExample.show();




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
