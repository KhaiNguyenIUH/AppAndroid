package com.example.student.thuchanh_tuan3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtid, edtname;
    Button btnNhap;
    RadioGroup rdoGroup;
    ListView lsvDS;
    ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
    ArrayAdapter<Employee> arrAdapter = null;
    Employee employee = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map();
        btnNhap.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Nhap();
            }
        });
    }
    public void map()
    {
        edtid= (EditText) findViewById(R.id.TxtID);
        edtname= (EditText) findViewById(R.id.TxtTen);
        btnNhap= (Button) findViewById(R.id.btnNhap);
        rdoGroup= (RadioGroup) findViewById(R.id.rdoGroup);
        lsvDS= (ListView) findViewById(R.id.LsvDS);
        arrAdapter= new ArrayAdapter<Employee>(this,android.R.layout.simple_list_item_1,arrEmployee);
        lsvDS.setAdapter(arrAdapter);
    }
    public void Nhap()
    {
        int rdoid=rdoGroup.getCheckedRadioButtonId();
        String id=edtid.getText()+"";
        String name=edtname.getText()+"";
        if(rdoid==R.id.rdoFull)
        {
            employee= new EmployeeFullTime();
        }
        else
        {
            employee= new EmployeeParttime();
        }
        employee.setId(id);
        employee.setName(name);
        arrEmployee.add(employee);
        arrAdapter.notifyDataSetChanged();
    }

}
