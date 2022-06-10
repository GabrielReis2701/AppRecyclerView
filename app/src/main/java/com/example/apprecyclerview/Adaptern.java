package com.example.apprecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Adaptern extends RecyclerView.Adapter<Adaptern.MyViewHolder>{


    private List<Filme> listaFilme;

    public Adapter(List <Filme> filme){
        this.listaFilme=filme;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list, parent, false);

        return new MyViewHolder((itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Filme filme = listaFilme.get(position);
        holder.titulo.setText(filme.getTitulo());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


        TextView titulo,ano,genero;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            titulo = itemView.findViewById(R.id.tv_genero);
            ano = itemView.findViewById(R.id.tv_ano);
            genero = itemView.findViewById(R.id.tv_genero);
        }
    }

}
