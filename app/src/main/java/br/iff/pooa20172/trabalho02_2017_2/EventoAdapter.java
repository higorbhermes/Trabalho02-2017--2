package br.iff.pooa20172.trabalho02_2017_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Higor on 29/11/2017.
 */

public class EventoAdapter extends ArrayAdapter<Evento>{
    private final Context context;
    private final ArrayList<Evento> elementos;

    public EventoAdapter(Context context, ArrayList<Evento> elementos) {
        super(context, R.layout.item_evento, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_evento, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.nome);
        TextView data = (TextView) rowView.findViewById(R.id.data);
        TextView local = (TextView) rowView.findViewById(R.id.local);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);

        nome.setText(elementos.get(position).getNome());
        data.setText(elementos.get(position).getData());
        local.setText(elementos.get(position).getLocal());
        imagem.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }
}
