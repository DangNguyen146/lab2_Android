package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class BaiTap3 extends AppCompatActivity {
    ArrayList<Employee> lstEmployee;
    Employee employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap3);

        lstEmployee=new ArrayList<Employee>();
        Button addBtn=(Button) findViewById(R.id.btn_add);
        EditText editText1=(EditText) findViewById(R.id.enter_id);
        EditText editText2=(EditText) findViewById(R.id.enter_name);
        RadioGroup radioGroup=(RadioGroup) findViewById(R.id.radio_container);
        ListView lvEmployee = (ListView)
                findViewById(R.id.lv);
        ArrayAdapter<Employee> adapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, lstEmployee);
        lvEmployee.setAdapter(adapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String id= editText1.getText().toString() ;
                String name=editText2.getText().toString();
                int val=  radioGroup.getCheckedRadioButtonId();
                if(val==R.id.btn1){
                    employee = new EmployeeFulltime();
                }
                else{
                    employee=new EmployeePartime();
                }
                employee.setId(id);
                employee.setName(name);
                //Đưa employee vào ArrayList
                lstEmployee.add(employee);
                //Cập nhập giao diện
                adapter.notifyDataSetChanged();
                editText1.setText("");
                editText2.setText("");


            }
        });
    }
}