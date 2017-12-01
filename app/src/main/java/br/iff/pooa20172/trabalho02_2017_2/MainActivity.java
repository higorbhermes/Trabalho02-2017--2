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
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("nome", evento.get(i).getNome());
            startActivity(intent);
            }
        });
    }

    private ArrayList<Evento> adicionarEvento() {
        ArrayList<Evento> evento = new ArrayList<Evento>();
        Evento ev1 = new Evento("Show Ed Sheeran", "26/04/17", "Alianz Arena", 45000, "", "", 345.00, R.drawable.nome);
        evento.add(ev1);


        return evento;
    }
}
