package br.iff.pooa20172.trabalho02_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

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

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(getBaseContext(), "Evento: "+evento.get(i).getNome(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("nome", evento.get(i).getNome());
            startActivity(intent);
            }
        });
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
