package com.example.fujit.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] alunos = {"Daniel, Ronaldo, Jeferson, Felipe"};
        //Instancia a lista

        ListView listaAlunos = (ListView) findViewById( R.id.lista_alunos );

        /*
        * ArrayAdapter
        * params Contexto, Modo de exibição, fonte de dados
        * */

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);
    }
}
