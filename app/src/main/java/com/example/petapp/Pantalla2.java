package com.example.petapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class Pantalla2 extends AppCompatActivity {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        Toolbar miActionBar=(Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        findViewById(R.id.estrella5).setVisibility(View.INVISIBLE);
        findViewById(R.id.space1).setVisibility(View.GONE);


        listaMascotas = (RecyclerView) findViewById(R.id.recyclerViewMascota2);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdpatador();
    }

    public MyAdapter adaptador;
    private void inicializarAdpatador (){
        adaptador = new MyAdapter(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }
    public  void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas("Pepe",5,R.drawable.p1));
        mascotas.add(new Mascotas("Luna",6,R.drawable.p2));
        mascotas.add(new Mascotas("Lupi",6,R.drawable.p3));
        mascotas.add(new Mascotas("Tim",6,R.drawable.p4));
        mascotas.add(new Mascotas("Fido",6,R.drawable.p5));

    }
}