package com.example.lap2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bai2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2c);
        Button btn= findViewById(R.id.btn_click);
        EditText ten = findViewById(R.id.edt_hoten);
        EditText ma = findViewById(R.id.edt_mssv);
        TextView inc =findViewById(R.id.in_thong_tin);
        EditText tuoi = findViewById(R.id.edt_tuoi);
        RadioButton gt= findViewById(R.id.nam);
        CheckBox   st1= findViewById(R.id.da_bong);
        CheckBox st2 = findViewById(R.id.choi_game);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Gt;
                String St1;

                String Hoten= ten.getText().toString() ;
                String Masv = ma.getText().toString();
                String Tuoi=tuoi.getText().toString();
                boolean nam = gt.isChecked();
                boolean dabong =st1.isChecked();
                boolean choigame =st2.isChecked();
                if (nam) {
                    Gt="nam";

                }
                else{
                    Gt="nu";
                }
                if (dabong && choigame){
                    St1="Da bong ,choigame";

                } else if (dabong==true && choigame==false){
                    St1="da bong";
                }else if (dabong==false && choigame==true){
                    St1 ="choigame";
                }else {
                    St1="khong co st";
                }
                inc.setText("ho ten:"+Hoten+"\n"
                           +"MSSV"+Masv+"\n"
                           +"Tuoi"+Tuoi+"\n"
                           +"Gioi Tinh:"+Gt+"\n"
                          +"So thich:"+St1+"\n"

                );

            }
        });

    }
}
