package pt.ulp.ei.projeto_21602631;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ProjetoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto_main);
    }

    public void Calcular(View v) {
        RadioGroup CilindradaGroup = (RadioGroup) findViewById( R.id.CilindradaGroup);
        RadioGroup co2 = (RadioGroup) findViewById( R.id.CO2);
        Double cilindrada = 0.0;
        Double carbono= 0.0;
        Double resultado= 0.0;
        int op =CilindradaGroup.getCheckedRadioButtonId();

        switch(op){

            case R.id.radioButtonCil1:
                cilindrada = 33.10;
                break;
            case R.id.radioButtonCil2:
                cilindrada= 66.50;
                break;
            case R.id.radioButtonCil3:
                cilindrada= 133.01;
                break;
            case R.id.radioButtonCil4:
                cilindrada= 455.30;
                break;
        }
        int co =co2.getCheckedRadioButtonId();

        switch(co){

            case R.id.radioButtonCil1:
                carbono= 57.00;
                break;
            case R.id.radioButtonCil2:
                carbono= 86.00;
                break;
            case R.id.radioButtonCil3:
                carbono= 187.00;
                break;
            case R.id.radioButtonCil4:
                carbono= 321.00;
                break;
        }
        resultado= cilindrada + carbono;
        TextView textViewResultado = (TextView) findViewById( R.id.textViewResultado);

        textViewResultado.setText("Resultado: " + resultado.toString());


    }
}
