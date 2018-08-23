package com.example.corei7.chuyendoinhietdo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;

public class NhietDo extends AppCompatActivity {
    Button btnClear,btnToC,btnToF;
    EditText txtF,txtC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhiet_do);
        //Kết nối id với class
        txtC = (EditText)findViewById(R.id.txtC);
        txtF = (EditText)findViewById(R.id.txtF);
        btnToC = (Button)findViewById(R.id.btnToC);
        btnToF = (Button)findViewById(R.id.btnToF);
        btnClear =(Button)findViewById(R.id.btnClear);
        // gọi hàm
        clear_data();
        CToF();
        FToC();
    }
    public void FToC()
    {
        btnToC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                float f;
                // Cách này phải nhập 0 vô ô cần đổi mới ko bị dis
                //c = Float.parseFloat(txtC.getText()+"");
                //f = Float.parseFloat(txtF.getText()+"");

                // Cách này sửa lỗi nhập empty ko bị dis
                //String toc = txtC.getText().toString();
                String tof = txtF.getText().toString();

                if(tof.matches(""))
                {
                    return;
                }
                else
                    {
                    f = Float.parseFloat(tof);
                }
                if(view == btnToC)
                {
                    txtC.setText(((f - 32) * 0.5555555556) + "");
                }
            }
        });
    }

    public void CToF()
    {
        btnToF.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                float c =0,f=0;
                // Cách này phải nhập 0 vô ô cần đổi mới ko bị dis
                //c = Float.parseFloat(txtC.getText()+"");
                //f = Float.parseFloat(txtF.getText()+"");

                // Cách này sửa lỗi nhập empty ko bị dis
                String toc = txtC.getText().toString();

                if(toc.matches("")){
                    return;
                }else{
                    c = Float.parseFloat(toc);
                }
                if(view == btnToF)
                {
                    txtF.setText((c * 1.8 +32) + "");
                }
            }
        });
    }

    private void clear_data()
    {
        btnClear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                txtC.getText().clear();
                txtF.getText().clear();
            }
        });
    }
}
