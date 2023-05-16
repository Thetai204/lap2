package com.example.lap2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bai2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2c);
        Button btn = findViewById(R.id.btn_click);
        EditText edtHoten = findViewById(R.id.edt_hoten);
        EditText edtMa = findViewById(R.id.edt_mssv);
        TextView tvShowInfor = findViewById(R.id.in_thong_tin);
        EditText edtTuoi = findViewById(R.id.edt_tuoi);
        RadioButton rbNam = findViewById(R.id.nam);
        RadioButton rbNu = findViewById(R.id.rb_nu);
        CheckBox chkDabong = findViewById(R.id.da_bong);
        CheckBox chkChoigame = findViewById(R.id.choi_game);

        LinearLayout lnCover = findViewById(R.id.layout_cover);

        lnCover.setBackgroundColor(getColor(android.R.color.holo_orange_light));

        tvShowInfor.setMaxLines(5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Gt;
                String St1;

                String Hoten = edtHoten.getText().toString();
                String Masv = edtMa.getText().toString();
                String Tuoi = edtTuoi.getText().toString();
                boolean nam = rbNam.isChecked();
                boolean nu = rbNu.isChecked();
                boolean dabong = chkDabong.isChecked();
                boolean choigame = chkChoigame.isChecked();
                if (nam) {
                    Gt = "nam";
                } else if (rbNu.isChecked()) {
                    Gt = "nu";
                } else {
                    Gt = getString(R.string.chon_gioitinh);
                }
                if (dabong && choigame) {
                    St1 = getString(R.string.dabong_choigame);

                } else if (dabong == true && choigame == false) {
                    St1 = "da bong";
                } else if (dabong == false && choigame == true) {
                    St1 = "choigame";
                } else {
                    St1 = "khong co st";
                }
                tvShowInfor.setText("ho ten:" + Hoten + "\n"
                        + "MSSV" + Masv + "\n"
                        + "Tuoi" + Tuoi + "\n"
                        + "Gioi Tinh:" + Gt + "\n"
                        + "So thich:" + St1 + "\n"

                );

            }
        });

    }
}
