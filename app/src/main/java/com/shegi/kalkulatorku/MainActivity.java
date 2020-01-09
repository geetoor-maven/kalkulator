package com.shegi.kalkulatorku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnreset,bnthasil,btnkurang,btnkali,btntambah,btnbagi;
    TextView txtmuncul;

    public static double nilaisekarang = 0;
    public static String operasisekarang = "";
    public static double hasil = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //melempar variabel ke objek
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);

        btntambah = findViewById(R.id.btntambah);
        btnkali = findViewById(R.id.btnkali);
        btnbagi = findViewById(R.id.btnbagi);
        btnkurang = findViewById(R.id.btnkurang);

        bnthasil = findViewById(R.id.btnsamadengan);
        btnreset = findViewById(R.id.btnreset);

        txtmuncul = findViewById(R.id.textmuncul);


        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText("");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmuncul.setText(txtmuncul.getText().toString().trim() + "0");
            }
        });


        //OPERATOR

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operasisekarang = "tambah";
                nilaisekarang = Double.parseDouble(txtmuncul.getText().toString());
                txtmuncul.setText("");
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operasisekarang = "kali";
                nilaisekarang = Double.parseDouble(txtmuncul.getText().toString());
                txtmuncul.setText("");
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operasisekarang = "bagi";
                nilaisekarang = Double.parseDouble(txtmuncul.getText().toString());
                txtmuncul.setText("");
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operasisekarang = "kurang";
                nilaisekarang = Double.parseDouble(txtmuncul.getText().toString());
                txtmuncul.setText("");
            }
        });

        //SAMPAI SINI

        //HASIL

        bnthasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operasisekarang.equals("tambah")){
                    hasil = nilaisekarang+Double.parseDouble(txtmuncul.getText().toString().trim());
                    txtmuncul.setText(String.valueOf(hasil));
                }else if (operasisekarang.equals("kali")){
                    hasil = nilaisekarang*Double.parseDouble(txtmuncul.getText().toString().trim());
                    txtmuncul.setText(String.valueOf(hasil));
                }else if (operasisekarang.equals("bagi")){
                    hasil = nilaisekarang/Double.parseDouble(txtmuncul.getText().toString().trim());
                    txtmuncul.setText(String.valueOf(hasil));
                }else if (operasisekarang.equals("kurang")){
                    hasil = nilaisekarang-Double.parseDouble(txtmuncul.getText().toString().trim());
                    txtmuncul.setText(String.valueOf(hasil));
                }

            }
        });
    }
}
