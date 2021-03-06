package com.example.apprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> filmes = new ArrayList<Filme>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.criarFilmes();;
        Adaptern adaptern = new Adaptern(filme);
        recyclerView = findViewById(R.id.rv_recicle);
        recyclerView.setLayoutManager(LayoutManager);

    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem aranaha - De volta ao lar", "Aventura", "2017");
        this.filmes.add(filme);

        filme = new Filme("Mulher maravilha", "Fantasia", "2018");
        this.filmes.add(filme);

        filme = new Filme("Liga da Justiça", "Aventura", "2017");
        this.filmes.add(filme);

        filme = new Filme("Capitão América - Guerra Civil", "Aventura/Ficção", "2018");
        this.filmes.add(filme);

        filme = new Filme("X-Men: Fênix Negra", "Ficção", "2020");
        this.filmes.add(filme);

        filme = new Filme("Esquadrão Suicida", "Ação", "2019");
        this.filmes.add(filme);

        filme = new Filme("Um amor para recordar", "Romance", "2005");
        this.filmes.add(filme);

        filme = new Filme("O Jardim Secreto", "Drama", "1997");
        this.filmes.add(filme);

        filme = new Filme("Mudança de Hábito", "Comédia", "1994");
        this.filmes.add(filme);

    }
}