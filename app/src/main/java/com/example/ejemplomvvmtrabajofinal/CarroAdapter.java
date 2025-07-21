package com.example.ejemplomvvmtrabajofinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ejemplomvvmtrabajofinal.dm.Carro;

import java.util.List;

public class CarroAdapter extends ArrayAdapter<Carro> {

    public CarroAdapter(Context context) {
        super(context, 0);
    }

    public void setCarros(List<Carro> carros) {
        clear();
        addAll(carros);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Carro carro = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_carro, parent, false);
        }

        TextView fabricante = convertView.findViewById(R.id.txtFabricante);
        TextView modelo = convertView.findViewById(R.id.txtModelo);
        TextView anio = convertView.findViewById(R.id.txtAnio);
        TextView gasolina = convertView.findViewById(R.id.txtGasolina);

        fabricante.setText("Fabricante: " + carro.getFabricante());
        modelo.setText("Modelo: " + carro.getModelo());
        anio.setText("Año: " + carro.getAnio());
        gasolina.setText("Gasolina: " + carro.getLtGasolina() + " L");

        return convertView;
    }
}