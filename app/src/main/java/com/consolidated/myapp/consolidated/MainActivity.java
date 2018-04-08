package com.consolidated.myapp.consolidated;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView activityList;
    private String[] activitiesNames = {
            "TextView",
            "Button",
            "Array",
            "Toast",
            "Activity navigation",
            "Activity information transfer",
            "Listview",
            "Alert dialog",
            "Checkbox",
            "Seekbar",
            "Radio button",
            "Toggle button",
            "Media player",
            "Shared preference",
            "Internal storage"
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
                
            }
        });
    }
}
