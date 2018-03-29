package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView m1 = (TextView) findViewById(R.id.menu_item_1);
        Log.i("m1","" + m1.getText().toString());
        // Find second menu item TextView and print the text to the logs
        TextView m2 = (TextView) findViewById(R.id.menu_item_2);
        Log.i("m2","" + m2.getText().toString());
        // Find third menu item TextView and print the text to the logs
        TextView m3 = (TextView) findViewById(R.id.menu_item_3);
        Log.i("m3","" + m3.getText().toString());
    }
}