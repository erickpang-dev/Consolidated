package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView activityList;
    private String[] activitiesNames = {
            "TextView",
            "Button",
            "Array",
            "Toast",
            "Activity Navigation",
            "Activity Information Transfer",
            "ListView",
            "Alert Dialog",
            "Checkbox",
            "SeekBar",
            "Radio Button",
            "Toggle Button",
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
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                activitiesNames
        );

        activityList.setAdapter(namesAdapter);
        activityList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("MainActivity", "Item clicked: " + i);
                switch (i){
                    case 0: Intent newActivity = new Intent(MainActivity.this, TextViewShowcase.class);
                            startActivity(newActivity);
                    break;
//                    case 1: Intent newActivity = new Intent(MainActivity.this, ButtonShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 2: Intent newActivity = new Intent(MainActivity.this, ArrayShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 3: Intent newActivity = new Intent(MainActivity.this, ToastShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 4: Intent newActivity = new Intent(MainActivity.this, ActivityNavigationShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 5: Intent newActivity = new Intent(MainActivity.this, ActivityInformationTransferShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 6: Intent newActivity = new Intent(MainActivity.this, ListViewShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 7: Intent newActivity = new Intent(MainActivity.this, AlertDialogShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 8: Intent newActivity = new Intent(MainActivity.this, CheckboxShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 9: Intent newActivity = new Intent(MainActivity.this, SeekBarShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 10: Intent newActivity = new Intent(MainActivity.this, RadioButtonShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 11: Intent newActivity = new Intent(MainActivity.this, ToggleButtonShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 12: Intent newActivity = new Intent(MainActivity.this, MediaPlayerShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 13: Intent newActivity = new Intent(MainActivity.this, SharedPreferenceShowcase.class);
//                            startActivity(newActivity);
//                    break;
//                    case 14: Intent newActivity = new Intent(MainActivity.this, InternalStorageShowcase.class);

                    default:
                        Toast.makeText(MainActivity.this, "Activity not created or linked", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


}
