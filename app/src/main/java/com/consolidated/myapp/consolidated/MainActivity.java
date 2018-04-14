package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView activityList;
    private String[] activitiesNames = {
            "TextView",
            "Button",
            "Activity Information Transfer",
            "Alert Dialog",
            "SeekBar",
            "Media Player",
            "Shared Preference",
            "Internal Storage"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityList = findViewById(R.id.activityListId);

        ArrayAdapter<String> namesAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_2,
                android.R.id.text2,
                activitiesNames


        );

        activityList.setAdapter(namesAdapter);
        activityList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("MainActivity", "Item clicked: " + i);
                switch (i){
                    case 0: Intent activity0 = new Intent(MainActivity.this, TextViewShowcase.class);
                            startActivity(activity0);
                    break;
                    case 1: Intent activity1 = new Intent(MainActivity.this, ButtonShowcase.class);
                            startActivity(activity1);
                    break;
                    case 2: Intent activity2 = new Intent(MainActivity.this, ActivityInformationTransferShowcase.class);
                            startActivity(activity2);
                    break;
                    case 3: Intent activity3 = new Intent(MainActivity.this, AlertDialogShowcase.class);
                            startActivity(activity3);
                    break;
                    case 4: Intent activity4 = new Intent(MainActivity.this, SeekBarShowcase.class);
                            startActivity(activity4);
                    break;
                    case 5: Intent activity5 = new Intent(MainActivity.this, MediaPlayerShowcase.class);
                            startActivity(activity5);
                    break;
//                    case 6: Intent activity6 = new Intent(MainActivity.this, SharedPreferenceShowcase.class);
//                            startActivity(activity6);
//                    break;
//                    case 7: Intent activity7 = new Intent(MainActivity.this, InternalStorageShowcase.class);
//                            startActivity(activity7);
//                    break;

                    default:
                        Toast.makeText(MainActivity.this, "Activity not created or linked", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


}
