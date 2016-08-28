package com.example.clarkhinchcliff.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        ArrayList<String> myFamily = new ArrayList<String>();

        myFamily.add("Clark");
        myFamily.add("Gayle");
        myFamily.add("Grant");
    }
}
