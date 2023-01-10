package com.example.funtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.funtable.MainActivity.EXTRA_MESSAGE;

public class DisplayTable extends AppCompatActivity  {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_table);
        ArrayList<String> milTablelist = (ArrayList<String>)getIntent().getSerializableExtra(EXTRA_MESSAGE);


        ListView textView = findViewById(R.id.tableShow);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,milTablelist);
        textView.setAdapter(arrayAdapter);
        TextView headline = findViewById(R.id.textView4);
        Intent i = getIntent();
        String hl = i.getStringExtra("title");
        headline.setText("Table of "+hl);

        }

        public void RewriteTable(View view) {
         Intent Revise = new Intent(this,revise_Table.class);
                Toast.makeText(this,"GOOD Let's Revise" ,Toast.LENGTH_LONG).show();
        }
}