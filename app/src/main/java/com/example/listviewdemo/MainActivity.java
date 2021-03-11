package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // declare private fields
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] classList = {"American Eng Dialects", "Eng Lang Grammar","CITA Seminar",
                "Computing Seminar", "Bachelor's Essay 1", "Bachelor's Essay 2", "CITA Capstone",
                "Indiginous Langs", "Print Making 1", "Elective", "Elective", "Elective",
                "Elective", "Elective", "Elective", "Elective", "Elective", "Elective", "Elective"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,classList);

        listView = findViewById(R.id.class_schedule);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}