package com.rde.android.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter ;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    RecyclerView recyText;
    Button btnAdd;
    SimpleRVAdapter itemsAdapter;

    ArrayList<String> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        recyText = findViewById(R.id.recyList);
        btnAdd = findViewById(R.id.btnAdd);

        items = new ArrayList<>();
        items.add("Task1");
        items.add("Task2");
        items.add("Task3");
        itemsAdapter = new SimpleRVAdapter(items) ;
        recyText.setAdapter(itemsAdapter);
     //   itemsAdapter.refresh();

    }
}
