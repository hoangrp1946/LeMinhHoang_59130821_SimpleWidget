package vn.ntu.edu.minhhoang.leminhhoang_59130821_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    EditText edtTen,edtNs,edtSt;
    RadioGroup checkRdo;
    CheckBox cbXp,cbNn,cbCf,cbOn,cbNa;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddView();
        AddEvent();
    }

    private void AddView()
    {
        edtTen=findViewById(R.id.edtTen);
        edtNs=findViewById(R.id.edtNs);
        edtSt=findViewById(R.id.edtSt);
        checkRdo=findViewById(R.id.checkradio);
        cbCf=findViewById(R.id.cbCf);
        cbXp=findViewById(R.id.cbXp);
        cbNn=findViewById(R.id.cbNn);
        cbNa=findViewById(R.id.cbNa);
        cbOn=findViewById(R.id.cbOn);
        btn=findViewById(R.id.btXn);
    }

    private void AddEvent()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }
    private void show()
    {
        String Result="";
        Result = edtTen.getText()+"\n"+
                "Ngày Sinh: "+ edtNs.getText()+"\n";
        switch (checkRdo.getCheckedRadioButtonId())
        {
            case R.id.rdNam:
                Result+="Giới Tính: "+
                        "Nam"+"\n" +
                        "Sở Thích: ";break;
            case R.id.rdNu:
                Result+="Giới Tính: "+
                        "Nữ"+"\n"+
                        "Sở Thích: ";break;
        }
        if(cbXp.isChecked()) {
            Result = Result + cbXp.getText() + "; ";
        }
        if(cbNn.isChecked()) {
            Result = Result + cbNn.getText() + "; ";
        }
        if(cbCf.isChecked()) {
            Result = Result + cbCf.getText() + "; ";
        }
        if(cbOn.isChecked()) {
            Result = Result + cbOn.getText() + "; ";
        }
        if(cbNa.isChecked()) {
            Result = Result + cbNa.getText() + "; ";
        }

        Result = Result + edtSt.getText();
        Toast.makeText(getApplicationContext(), Result, Toast.LENGTH_LONG).show();

    }


}

