package com.example.ejemplomvvmtrabajofinal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ejemplomvvmtrabajofinal.dm.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroViewModel extends ViewModel {

    private final MutableLiveData<List<Carro>> carroList;

    public CarroViewModel() {
        carroList = new MutableLiveData<>();
        loadCarros();
    }

    private void loadCarros() {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Toyota", "Corolla", 2020, 50));
        carros.add(new Carro("Honda", "Civic", 2019, 40));
        carros.add(new Carro("Ford", "Focus", 2018, 35));
        carros.add(new Carro("Mazda", "3", 2021, 45));
        carroList.setValue(carros);
    }

    public LiveData<List<Carro>> getCarroList() {
        return carroList;
    }
}