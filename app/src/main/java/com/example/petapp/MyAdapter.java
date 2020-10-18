package com.example.petapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


    public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MascotaViewHolder> {
    ArrayList<Mascotas> mascotas;
    Activity activity;

    public MyAdapter(ArrayList<Mascotas> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder MascotaViewholder, int position) {
        final Mascotas mascota = mascotas.get(position);
        MascotaViewholder.imgMascota.setImageResource(mascota.getFotoMascota());
        MascotaViewholder.tvNombre.setText(mascota.getNombreMascota());
        MascotaViewholder.tvotos.setText(mascota.getVotoMascota().toString());
        MascotaViewholder.butthueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Te gusta esta Mascota",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgMascota;
        private TextView tvNombre;
        private TextView tvotos;
        private ImageButton butthueso;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMascota = (ImageView) itemView.findViewById(R.id.ifotoM);
            tvNombre = itemView.findViewById(R.id.tnombreM);
            tvotos= itemView.findViewById(R.id.tvotoM);
            butthueso=itemView.findViewById(R.id.buttHueso);

        }
    }

}
