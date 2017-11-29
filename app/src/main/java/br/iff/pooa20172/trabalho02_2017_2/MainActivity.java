package br.iff.pooa20172.trabalho02_2017_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lvEquipes);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.equipes,android.R.layout.simple_list_item_1);

        lista.setAdapter(adapter);
    }
}