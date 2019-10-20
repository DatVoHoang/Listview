package com.example.buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<Flag> arrayList;
    FlagAdapter flagAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        arrayList = Flag.initFlag();
        flagAdapter = new FlagAdapter(MainActivity.this,
                R.layout.layout_row,
                arrayList);

        list.setAdapter(flagAdapter);
    }


}

