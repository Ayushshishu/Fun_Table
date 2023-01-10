package com.example.funtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Display;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.funtable.MESSAGE";
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void showTable(View view) {
        Intent intent = new Intent(this, DisplayTable.class);


        EditText x = findViewById(R.id.x);
        x.setInputType(InputType.TYPE_CLASS_NUMBER);

        int z;
        z = Integer.parseInt(String.valueOf(x.getText()));
        ArrayList<String> mulTable = new ArrayList<>();
        for(int i=1;i<=10;i++) {
            mulTable.add(z + " X " + i + " = " + z * i);
        }



        intent.putExtra("title",x.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, mulTable);
        startActivity(intent);
        };








    }
