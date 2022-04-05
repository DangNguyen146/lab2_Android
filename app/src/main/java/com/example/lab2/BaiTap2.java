package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class BaiTap2 extends AppCompatActivity {
    ListView l;
    TextView textView;
    ArrayList<String> names = new ArrayList<String>(
            Arrays.asList("Teo", "Ty", "Bin", "Bo")
    );
    Button btnSubmit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap2);

        ListView lvPerson = (ListView) findViewById(R.id.listview2);
        btnSubmit2 = findViewById(R.id.btnSubmit2);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        lvPerson.setAdapter(adapter);
        textView = (TextView) findViewById(R.id.textView4);
        lvPerson.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?>arg0, View arg1, int arg2, long arg3) { //đối số arg2 là vị trí phần tử trong Data  Source (arr)
                textView.setText("position :" + arg2 + "; value =" + names.get(arg2));
            }
        });
        btnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Thêm dữ liệu mới vào arraylist
                EditText inputName2 = findViewById(R.id.inputName2);
                names.add(inputName2.getText().toString());

                adapter.notifyDataSetChanged();

            }
        });

    }
}