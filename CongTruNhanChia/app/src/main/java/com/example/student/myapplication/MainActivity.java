package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton cong, tru, nhan, chia;
    EditText a,b;
    TextView kp;
    Button btn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();
    }
    private void connectView() {
        kp = (TextView) findViewById(R.id.textView);
        a = (EditText) findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClickButton();
            }
        });
    }
    private void doClickButton() {
        RadioGroup group= (RadioGroup) findViewById(R.id.rdoGroup1);
        int checked=group.getCheckedRadioButtonId();
        switch (checked)
        {
            case R.id.radioButton:
                Tong();
                //kp.setText("djtme");
                break;
            case R.id.radioButton2:
                Hieu();
                break;
            case R.id.radioButton3:
                Nhan();
                break;
            case R.id.radioButton4:
                Chia();
                break;
        }
    }
    public void Tong()
    {
        int s,y;
        s=Integer.parseInt(a.getText()+"");
        y=Integer.parseInt(b.getText()+"");
        kp.setText(""+(s+y));
    }
    public void Hieu()
    {
        int s,y;
        s=Integer.parseInt(a.getText()+"");
        y=Integer.parseInt(b.getText()+"");
        kp.setText(""+(s-y));
    }
    public void Nhan()
    {
        int s,y;
        s=Integer.parseInt(a.getText()+"");
        y=Integer.parseInt(b.getText()+"");
        kp.setText(""+(s*y));
    }
    public void Chia()
    {
        Float s,y;
        s=Float.parseFloat(a.getText()+"");
        y=Float.parseFloat(b.getText()+"");
        kp.setText(""+(s/y));
    }
}
