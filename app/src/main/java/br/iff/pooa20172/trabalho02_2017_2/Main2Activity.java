package br.iff.pooa20172.trabalho02_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText et_Nome = (EditText) findViewById(R.id.et_Nome);
        EditText et_Data = (EditText) findViewById(R.id.et_Data);
        EditText et_Local = (EditText) findViewById(R.id.et_Local);
        EditText et_Capacidade = (EditText) findViewById(R.id.et_Capacidade);
        EditText et_Promotor = (EditText) findViewById(R.id.et_Promotor);
        EditText et_Patrocinio = (EditText) findViewById(R.id.et_Patrocinio);
        EditText et_Valor = (EditText) findViewById(R.id.et_Valor);

        Intent intent = getIntent();

        String nome = (String) intent.getSerializableExtra("nome");
        String data = (String) intent.getSerializableExtra("data");
        String local = (String) intent.getSerializableExtra("local");
        int capacidade = (int) intent.getSerializableExtra("capacidade");
        String promotor = (String) intent.getSerializableExtra("promotor");
        String patrocinio = (String) intent.getSerializableExtra("patrocinio");
        double valor = (double) intent.getSerializableExtra("valor");

        et_Nome.setText(nome);
        et_Data.setText(data);
        et_Local.setText(local);
        et_Capacidade.setText(Integer.toString(capacidade));
        et_Promotor.setText(promotor);
        et_Patrocinio.setText(patrocinio);
        et_Valor.setText(Double.toString(valor));
    }

    public void finish() {
        EditText et_Nome = (EditText) findViewById(R.id.et_Nome);
        EditText et_Data = (EditText) findViewById(R.id.et_Data);
        EditText et_Local = (EditText) findViewById(R.id.et_Local);
        EditText et_Capacidade = (EditText) findViewById(R.id.et_Capacidade);
        EditText et_Promotor = (EditText) findViewById(R.id.et_Promotor);
        EditText et_Patrocinio = (EditText) findViewById(R.id.et_Patrocinio);
        EditText et_Valor = (EditText) findViewById(R.id.et_Valor);

        Intent intent = new Intent();

        intent.putExtra("nome", et_Nome.getText());
        intent.putExtra("data", et_Data.getText());
        intent.putExtra("local", et_Local.getText());
        intent.putExtra("capacidade", et_Capacidade.getText());
        intent.putExtra("promotor", et_Promotor.getText());
        intent.putExtra("patrocinio", et_Patrocinio.getText());
        intent.putExtra("valor", et_Valor.getText());
        intent.putExtra("retorno", "Retornou");
        setResult(RESULT_OK, intent);
        super.finish();
    }

}
