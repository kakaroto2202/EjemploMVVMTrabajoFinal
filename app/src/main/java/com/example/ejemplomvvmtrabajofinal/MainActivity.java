package com.example.ejemplomvvmtrabajofinal;

import android.os.Bundle;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.ejemplomvvmtrabajofinal.dm.Carro;

import java.util.List;


/*
Estructura del proyecto:

com.example.ejemplomvvmtrabajofinal
    ├── MainActivity.java
    ├── CarroViewModel.java
    ├── CarroAdapter.java
    ├── dm/Carro.java
    ├── res/layout/activity_main.xml
    ├── res/layout/item_carro.xml
*/

public class MainActivity extends AppCompatActivity {

    private CarroViewModel carroViewModel;
    private CarroAdapter carroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        carroAdapter = new CarroAdapter(this);
        listView.setAdapter(carroAdapter);

        carroViewModel = new ViewModelProvider(this).get(CarroViewModel.class);
        carroViewModel.getCarroList().observe(this, new Observer<List<Carro>>() {
            @Override
            public void onChanged(List<Carro> carros) {
                carroAdapter.setCarros(carros);
            }
        });




    }
}