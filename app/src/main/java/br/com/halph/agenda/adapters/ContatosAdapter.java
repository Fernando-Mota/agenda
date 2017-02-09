package br.com.halph.agenda.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.halph.agenda.R;
import br.com.halph.agenda.models.Contato;

/**
 * Created by Android on 07/02/2017.
 */

public class ContatosAdapter extends RecyclerView.Adapter<ContatosAdapter.ContatosViewHolder> {

    private List<Contato> contatos;

    @Override
    public ContatosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflada = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista_contatos, parent, false);
        return new ContatosViewHolder(viewInflada);
    }

    @Override
    public void onBindViewHolder(ContatosViewHolder holder, int position) {
        Contato contato = contatos.get(position);
        holder.nome.setText(contato.getNome());
        holder.telefone.setText(contato.getTelefone());
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }

    static class ContatosViewHolder extends RecyclerView.ViewHolder {

        ImageView foto;
        TextView nome;
        TextView telefone;
        ImageView favorito;



        public ContatosViewHolder(View itemView) {
            super(itemView);

            foto = (ImageView) itemView.findViewById(R.id.foto);
            nome = (TextView) itemView.findViewById(R.id.nome);
            telefone = (TextView) itemView.findViewById(R.id.telefone);
            favorito = (ImageView) itemView.findViewById(R.id.favorito);
        }
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;

    }

}
