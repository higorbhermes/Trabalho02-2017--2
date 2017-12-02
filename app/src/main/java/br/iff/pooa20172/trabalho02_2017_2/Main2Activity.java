package br.iff.pooa20172.trabalho02_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

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
        /*EditText et_Nome = (EditText) findViewById(R.id.et_Nome);
        EditText et_Data = (EditText) findViewById(R.id.et_Data);
        EditText et_Local = (EditText) findViewById(R.id.et_Local);
        EditText et_Capacidade = (EditText) findViewById(R.id.et_Capacidade);
        EditText et_Promotor = (EditText) findViewById(R.id.et_Promotor);
        EditText et_Patrocinio = (EditText) findViewById(R.id.et_Patrocinio);
        EditText et_Valor = (EditText) findViewById(R.id.et_Valor);*/

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("nome", ((EditText) findViewById(R.id.et_Nome)).getText().toString());
        bundle.putString("local", ((EditText) findViewById(R.id.et_Local)).getText().toString());
        bundle.putString("data", ((EditText) findViewById(R.id.et_Data)).getText().toString());
        bundle.putString("promotor", ((EditText) findViewById(R.id.et_Promotor)).getText().toString());
        bundle.putString("patrocinio", ((EditText) findViewById(R.id.et_Patrocinio)).getText().toString());
        bundle.putInt("capacidade", Integer.parseInt(((EditText) findViewById(R.id.et_Capacidade)).getText().toString()));
        bundle.putDouble("valor", Double.parseDouble(((EditText) findViewById(R.id.et_Valor)).getText().toString()));
        intent.putExtras(bundle);

        /*Intent intent2 = new Intent();
        intent2.putExtra("nome", et_Nome.getText());
        intent2.putExtra("data", et_Data.getText());
        intent2.putExtra("local", et_Local.getText());
        intent2.putExtra("capacidade", et_Capacidade.getText());
        intent2.putExtra("promotor", et_Promotor.getText());
        intent2.putExtra("patrocinio", et_Patrocinio.getText());
        intent2.putExtra("valor", et_Valor.getText());
        intent2.putExtra("retorno", "Retornou");*/
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
