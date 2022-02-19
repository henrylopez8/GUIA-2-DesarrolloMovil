package sv.edu.udb.descuentossalario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText horasTrabajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre= (EditText) findViewById(R.id.txtnombre);
        horasTrabajo= (EditText) findViewById(R.id.txthoras);


    }
    public void CalcularSalario(View v){
        Intent i = new Intent(this,MostrarSalarios.class);
        i.putExtra("txtnombre",nombre.getText().toString());
        i.putExtra("txthoras",horasTrabajo.getText().toString());
        startActivity(i);

    }
}