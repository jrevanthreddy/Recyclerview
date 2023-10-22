package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.adapter.MycustomAdapter;
import com.example.recycleview.model.Zomato;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Zomato> zomatoList;

    MycustomAdapter mycustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        zomatoList = new ArrayList<>();

        Zomato zomato1  = new Zomato("Grilled chicken", "4.2", "₹399",R.drawable.grilledchicken3);
        Zomato zomato2  = new Zomato("Grilled FIsh", "3.9", "₹499",R.drawable.grilledfish3);
        Zomato zomato3  = new Zomato("Noodels", "4.2", "₹299",R.drawable.noodels3);
        Zomato zomato4  = new Zomato("Pasta", "4.0", "₹250",R.drawable.pasta5);
        Zomato zomato5  = new Zomato("Pizza", "3.9", "₹499",R.drawable.pizza3);
        Zomato zomato6  = new Zomato("Tandoori Chicken", "4.2", "₹499",R.drawable.tandoorichicken4);


        zomatoList.add(zomato1);
        zomatoList.add(zomato2);
        zomatoList.add(zomato3);
        zomatoList.add(zomato4);
        zomatoList.add(zomato5);
        zomatoList.add(zomato6);


        mycustomAdapter = new MycustomAdapter(zomatoList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mycustomAdapter);
    }
}