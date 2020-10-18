package com.example.petapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter2 extends RecyclerView.Adapter <MyAdapter2.MascotaViewHolder> {
    ArrayList<Mascotas> mascotas;
    Activity activity;

    public MyAdapter2(ArrayList<Mascotas> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.detalle_mascotas,parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder MascotaViewholder, int position) {
        final Mascotas mascota = mascotas.get(position);
        MascotaViewholder.imgMascota.setImageResource(mascota.getFotoMascota());
        MascotaViewholder.tvotos.setText(mascota.getVotoMascota().toString());

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgMascota;
        private TextView tvotos;


        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMascota = (ImageView) itemView.findViewById(R.id.imagenMascota);
            tvotos= itemView.findViewById(R.id.textMascotaVotos);

        }
    }

}
