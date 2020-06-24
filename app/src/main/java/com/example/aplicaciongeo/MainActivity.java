package com.example.aplicaciongeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Agregar elementos para conectarnos a la vista
    private EditText editTextnx1;
    private EditText editTextnx2;
    private EditText editTextNy1;
    private EditText editTextny2;
    private Button buttoncalcular;
    private EditText editTextdistanciar;
    private EditText editTextpendiente;
    private Button buttonCalcPendiente;

    private void iniciar(){
        editTextnx1 = (EditText)findViewById(R.id.editTextnx1);
        editTextnx2 = (EditText)findViewById(R.id.editTextnx2);

        editTextNy1 = (EditText)findViewById(R.id.editTextNy1);
        editTextny2= (EditText)findViewById(R.id.editTextny2);
        editTextdistanciar = (EditText)findViewById(R.id.editTextdistanciar);
        editTextpendiente = (EditText)findViewById(R.id.editTextpendiente);

        //inicializar el boton
        buttoncalcular = (Button)findViewById(R.id.buttoncalcular);
        buttonCalcPendiente = (Button)findViewById(R.id.buttonCalcPendiente);

        //asignarle un controlador de eventos: listener
        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
            }
        });
        buttonCalcPendiente.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            pendiente();
            }
        }));
    }

    private void  calcular() {
        double x1 = Double.parseDouble(editTextnx1.getText().toString());
        double x2 = Double.parseDouble(editTextnx2.getText().toString());
        double y1 = Double.parseDouble(editTextNy1.getText().toString());
        double y2 = Double.parseDouble(editTextny2.getText().toString());


        double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        editTextdistanciar.setText(String.valueOf(distancia));
        //editN3.setText(String.valueOf(resultadote));

        //double pendiente = ((y2-y1) / (x2-x1));
        //editTextpendiente.setText(String.valueOf(pendiente));
    }


    //asignarle un controlador de eventos: listener



private void pendiente() {
    double x1 = Double.parseDouble(editTextnx1.getText().toString());
    double x2 = Double.parseDouble(editTextnx2.getText().toString());
    double y1 = Double.parseDouble(editTextNy1.getText().toString());
    double y2 = Double.parseDouble(editTextny2.getText().toString());

    double pendiente = ((y2-y1) / (x2-x1));
    editTextpendiente.setText(String.valueOf(pendiente));
}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
    }
}