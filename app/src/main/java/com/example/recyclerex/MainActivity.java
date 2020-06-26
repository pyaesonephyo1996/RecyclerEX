package com.example.recyclerex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import adapter.MyListAdapter;
import custom.MyListData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListData[] listData = new MyListData[] {
                new MyListData("Email",R.drawable.ic_email),
                new MyListData("Info",R.drawable.ic_info),
                new MyListData("Alert",R.drawable.ic_add_alert),
                new MyListData("Delete",R.drawable.ic_delete),
                new MyListData("Dialer",R.drawable.ic_dialpad),
                new MyListData("Email",R.drawable.ic_email),
                new MyListData("Info",R.drawable.ic_info),
                new MyListData("Alert",R.drawable.ic_add_alert),
                new MyListData("Delete",R.drawable.ic_delete),
                new MyListData("Dialer",R.drawable.ic_dialpad),
                new MyListData("Email",R.drawable.ic_email),
                new MyListData("Info",R.drawable.ic_info),
                new MyListData("Alert",R.drawable.ic_add_alert),
                new MyListData("Delete",R.drawable.ic_delete),
                new MyListData("Dialer",R.drawable.ic_dialpad),
        };

        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        MyListAdapter myListAdapter = new MyListAdapter(listData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myListAdapter);
    }
}
