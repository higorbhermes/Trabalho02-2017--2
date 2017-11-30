package br.iff.pooa20172.trabalho02_2017_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lvEquipes);

        final ArrayList<Evento> evento = adicionarEvento();

        ArrayAdapter adapter = new EventoAdapter(this, evento);
        lista.setAdapter(adapter);

        lista.setAdapter(adapter);
    }

    private ArrayList<Evento> adicionarEvento() {
        ArrayList<Evento> evento = new ArrayList<Evento>();
        Evento e = new Evento("Nome do Evento", R.drawable.nome);
        evento.add(e);
        Evento f = new Evento("Data do Evento", R.drawable.data);
        evento.add(f);
        Evento g = new Evento("Local do Evento", R.drawable.local);
        evento.add(g);
        return evento;
    }
}
