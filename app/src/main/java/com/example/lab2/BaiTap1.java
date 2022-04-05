package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class BaiTap1 extends AppCompatActivity {
    ListView l;
    TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap1);

        ListView lvPerson = (ListView) findViewById(R.id.listview1);
        final String arr[] = {"Teo", "Ty", "Bin", "Bo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        lvPerson.setAdapter(adapter);
        textView = (TextView) findViewById(R.id.textView);

        lvPerson.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?>arg0, View arg1, int arg2, long arg3) { //đối số arg2 là vị trí phần tử trong Data  Source (arr)
                        textView.setText("position :" + arg2 + "; value =" + arr[arg2]);
                    }
                });


    }
}