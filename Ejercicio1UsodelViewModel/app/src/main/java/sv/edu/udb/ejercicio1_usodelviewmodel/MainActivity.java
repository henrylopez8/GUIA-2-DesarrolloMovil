package sv.edu.udb.ejercicio1_usodelviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtsumar;
    private Button btnsumar;
    private int num=0;

    private ViewModelSumar viewModelSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       viewModelSumar = new ViewModelProvider(this).get(ViewModelSumar.class);
        txtsumar = findViewById(R.id.txtsumar);
        btnsumar= findViewById(R.id.btnsumar);

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    txtsumar.setText(String.valueOf(viewModelSumar.getNumero()));

            }
        });



    }

}