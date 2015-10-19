package com.example.jay.univer3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class AvailableTennisMentors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_tennis_mentors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] mentors = {"+25          Anne\n             Skill level: Semi-pro\n             Fee: $25/hr",
                "+11          Bob\n             Skill level: Intermediate\n             Fee: $15/hr",
                "+8           Steve\n              Skill level: Semi-pro\n              Fee: $30/hr",
                "+4           Farhad\n              Skill level: Semi-pro\n              Fee: $25/hr",
                "+3           Buck\n              Skill level: Intermediate\n              Fee: $10/hr",
                "+1           Peter\n              Skill level: Intermediate\n              Fee: $12/hr"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1,mentors);
        final ListView listView2=(ListView) findViewById(R.id.listView2);
        listView2.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView2.setAdapter(myAdapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(AvailableTennisMentors.this, AnneProfile.class);
                startActivity(intent);
            }
        });



        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
