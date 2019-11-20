package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button botonHora;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton botonAzul = findViewById(R.id.botonAzul);
        RadioButton botonVerde = findViewById(R.id.botonVerde);
        RadioButton botonRojo = findViewById(R.id.botonRojo);
        botonHora = (Button)findViewById(R.id.botonHora);
        botonHora.setOnClickListener(this);

    }

    public void onCheckboxClicked(View view) {
        CheckBox botonCheck = findViewById(R.id.checkBox);
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked){
                    botonCheck.setText(getResources().getText(R.string.checkOn));
                } else{
                    botonCheck.setText(getResources().getText(R.string.checkOff));
                }
                break;
        }
    }

    @Override
    public void onClick(View v){
        botonHora.setText(new Date().toString());
        botonHora.setBackgroundColor(getResources().getColor(R.color.verde));
    }

    public void reiniciarTexto(View v){
        TextView textoAReiniciar = findViewById(R.id.textoEditable);
        textoAReiniciar.setText(getResources().getText(R.string.hola));
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView textoCambio = findViewById(R.id.textoAPintar);

        switch(view.getId()) {
            case R.id.botonRojo:
                if (checked)
                    textoCambio.setBackgroundColor(getResources().getColor(R.color.rojo));
                    break;
            case R.id.botonVerde:
                if (checked)
                    textoCambio.setBackgroundColor(getResources().getColor(R.color.verde));
                    break;
            case R.id.botonAzul:
                if (checked)
                    textoCambio.setBackgroundColor(getResources().getColor(R.color.azul));
                    break;
        }
    }



}
