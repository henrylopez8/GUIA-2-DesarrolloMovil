package sv.edu.udb.descuentossalario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MostrarSalarios extends AppCompatActivity {

    private TextView DISS;
    private TextView DAFP;
    private TextView DRenta;
    private TextView MosSalarioNeto;
    private TextView Mnombre;
    Double horaportrabajo=8.50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_salarios);

        DISS= (TextView) findViewById(R.id.DISS);
        DAFP= (TextView) findViewById(R.id.DAFP);
        DRenta= (TextView) findViewById(R.id.DRenta);
        MosSalarioNeto=(TextView) findViewById(R.id.MSalarioNeto);
        Mnombre=(TextView) findViewById(R.id.MNombre);

        Bundle bundle= getIntent().getExtras();
        Double horas= Double.parseDouble( bundle.getString("txthoras"));
        String nombre= bundle.getString("txtnombre");
        Double Salario=horas*horaportrabajo;
        Double ISS= Salario*0.02;
        Double AFP= Salario*0.03;
        Double Renta = Salario*0.04;
        Double SalarioNeto= Salario-ISS-AFP-Renta;

        DISS.setText("$ "+ISS.toString());
        DAFP.setText("$ "+AFP.toString());
        DRenta.setText("$ " +Renta.toString());
       MosSalarioNeto.setText("$ "+SalarioNeto.toString());
       Mnombre.setText(nombre);


    }
}