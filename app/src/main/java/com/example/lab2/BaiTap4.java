package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class BaiTap4 extends AppCompatActivity {
    private List<Employee5> employees;
    private EmployeeAdapter employeeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap4);

        // ViewByID
        EditText getID=(EditText) findViewById(R.id.enter_id5);
        EditText getFullname=(EditText) findViewById(R.id.enter_name5);
        CheckBox cbManager=(CheckBox) findViewById(R.id.checkBox);
        Button btnAdd=(Button) findViewById(R.id.btn_add5);
        ListView lvEmployee=(ListView) findViewById(R.id.lv5);

        // Init data
        employees=new ArrayList<>();
        employeeAdapter=new EmployeeAdapter(BaiTap4.this, 1, employees);

        // Set adapter for lvEmployee
        lvEmployee.setAdapter(employeeAdapter);

        // Handle clicks btnAdd
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Init new employee
                Employee5 employee=new Employee5();
                employee.setId(getID.getText().toString());
                employee.setFullName(getFullname.getText().toString());
                employee.setManager(cbManager.isChecked());

                // Add new employee to list
                employees.add(employee);

                // Update new data to listview
                employeeAdapter.notifyDataSetChanged();

                // Remove added data
                getFullname.setText("");
                getID.setText("");
                cbManager.setChecked(false);
                // Focus to etID
                getID.requestFocus();
            }
        });


    }
}