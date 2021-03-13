package com.rahul009.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button defaultToast,simpleToast,nestToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defaultToast=findViewById(R.id.defaultToast);
        simpleToast=findViewById(R.id.simpleToast);
        nestToast=findViewById(R.id.nestToast);


        defaultToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"by Default Toast",Toast.LENGTH_SHORT).show();
            }
        });
        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=5,b=4;
                        int c=a+b;

                Toast toast=   Toast.makeText(MainActivity.this,"by Default Toast  ="+c,Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();

            }
        });
        nestToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast toast= Toast.makeText(MainActivity.this,"Simple gravity Toast",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);
                    toast.show();

            }
        });
    }
}