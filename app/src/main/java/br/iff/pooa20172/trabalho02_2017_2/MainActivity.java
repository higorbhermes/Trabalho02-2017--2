package br.iff.pooa20172.trabalho02_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_CONFIRMACAO = 0;
    private ArrayList<Evento> evento;
    private ArrayAdapter adapter;
    private Evento ev;
    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lvEquipes);
        final ArrayList<Evento> evento = adicionarEvento();
        adapter = new EventoAdapter(this, evento);
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            pos = i;
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            Bundle bundle = evento.get(i).toBundle();
            intent.putExtras(bundle);
            /*Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("nome", evento.get(i).getNome());
            intent.putExtra("data", evento.get(i).getData());
            intent.putExtra("local", evento.get(i).getLocal());
            intent.putExtra("capacidade", evento.get(i).getCapacidade());
            intent.putExtra("promotor", evento.get(i).getPromotor());
            intent.putExtra("patrocinio", evento.get(i).getPatrocinio());
            intent.putExtra("valor", evento.get(i).getValor());*/
            startActivityForResult(intent, REQUEST_CODE_CONFIRMACAO);
        }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent retorno) {
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE_CONFIRMACAO) {
            Bundle dados = retorno.getExtras();
            ev = evento.get(pos);
            if(dados.containsKey("nome")){
                ev.setNome(dados.getString("nome"));
                TextView tvNome = (TextView) findViewById(R.id.nome);
                tvNome.setText(dados.getString("nome"));
            }
            if(dados.containsKey("local")){
                ev.setLocal(dados.getString("local"));
            }
            if(dados.containsKey("promotor")){
                ev.setPromotor(dados.getString("promotor"));
            }
            if(dados.containsKey("patrocinio")){
                ev.setPatrocinio(dados.getString("patrocinio"));
            }
            if(dados.containsKey("capacidade")){
                ev.setCapacidade(dados.getInt("capacidade"));
            }
            if(dados.containsKey("data")){
                ev.setData(dados.getString("data"));
            }
            if(dados.containsKey("valor")){
                ev.setValor(dados.getDouble("valor"));
            }
            adapter.notifyDataSetChanged();
        }
    }

    private ArrayList<Evento> adicionarEvento() {
        evento = new ArrayList<Evento>();
        Evento ev1 = new Evento("Botafogo x Cruzeiro", "03/12/17", "Rio de Janeiro, Estadio do Engenhão", 45000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev1);
        Evento ev2 = new Evento("Vasco x Ponte Preta", "03/12/17", "Rio de Janeiro, São Januário", 30000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev2);
        Evento ev3 = new Evento("Santos x Avaí", "03/12/17", "Santos, Vila Belmiro", 18000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev3);
        Evento ev4 = new Evento("São Paulo x Bahia", "03/12/17", "São Paulo, Estádio do Morumbi", 65000, "CBF", "", 10.00, R.drawable.nome);
        evento.add(ev4);
        Evento ev5 = new Evento("Atlético-MG x Grêmio", "03/12/17", "Belo Horizonte, Estádio Independência", 18000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev5);
        Evento ev6 = new Evento("Atlética-PR x Palmeiras", "03/12/17", "Curitiba, Arena da Baixada", 38000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev6);
        Evento ev7 = new Evento("Sport x Corinthians", "03/12/17", "Recife, Ilha do Retiro", 18000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev7);
        Evento ev8 = new Evento("Vitória x Flamengo", "03/12/17", "Salvador, Estádio Barradão", 25000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev8);
        Evento ev9 = new Evento("Atlético-GO x Fluminense", "03/12/17", "Goiânia, Estádio Serra Dourada", 39000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev9);
        Evento ev10 = new Evento("Chapecoense x Coritiba", "03/12/17", "Chapecó, Arena Condá", 25000, "CBF", "", 50.00, R.drawable.nome);
        evento.add(ev10);
        return evento;
    }
}
