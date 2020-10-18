package com.example.petapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentMascota extends Fragment {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mascota, container, false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.recyclerViewMascota);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdpatador();
        return v;
    }
    public MyAdapter adaptador;
    private void inicializarAdpatador (){
        adaptador = new MyAdapter(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }
    public  void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("Pepe",5,R.drawable.p1));
        mascotas.add(new Mascotas("Luna",6,R.drawable.p2));
        mascotas.add(new Mascotas("Lupi",6,R.drawable.p3));
        mascotas.add(new Mascotas("Tim",6,R.drawable.p4));
        mascotas.add(new Mascotas("Fido",6,R.drawable.p5));
        mascotas.add(new Mascotas("Loly",6,R.drawable.p6));
        mascotas.add(new Mascotas("Sun",6,R.drawable.p7));
    }
}