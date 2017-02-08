package br.com.halph.agenda.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import br.com.halph.agenda.R;

public class ListaContatosActivity extends AppCompatActivity {

    RecyclerView recyclerViewListaContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);

        recyclerViewListaContatos = (RecyclerView) findViewById(R.id.lista_contatos);

        List<Contato> contatos = Arrays.asList(new Contato("9999-9999", "Zé", false), new Contato("9999-9999", "Maria", false), new Contato("9999-9999", "Tereza", false));
        ContatosAdapter contatosAdapter = new ContatosAdapter();
        contatosAdapter.contatos = contatos;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerViewListaContatos.setAdapter(contatosAdapter);
        recyclerViewListaContatos.setLayoutManager(linearLayoutManager);
    }
}
