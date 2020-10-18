package com.example.petapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MascotaDetalle extends Fragment {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mascota_detalle, container, false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.recyclerDetalles);
        LinearLayoutManager llm = new GridLayoutManager(getActivity(),3);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdpatador();
        return v;
    }
    public MyAdapter2 adaptador;
    private void inicializarAdpatador (){
        adaptador = new MyAdapter2(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }
    public  void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("Loly",5,R.drawable.p6));
        mascotas.add(new Mascotas("Loly",6,R.drawable.images4));
        mascotas.add(new Mascotas("Loly",6,R.drawable.bf1));
        mascotas.add(new Mascotas("Loly",6,R.drawable.bf2));
        mascotas.add(new Mascotas("Loly",6,R.drawable.bf3));

    }
}