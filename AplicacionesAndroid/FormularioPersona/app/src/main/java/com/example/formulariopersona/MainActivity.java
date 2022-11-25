package com.example.formulariopersona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2,et3,et4;
    private TextView tv1;
    private CheckBox cb1,cb2,cb3;
    private RatingBar rb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.nombrePersona);
        et2 = (EditText) findViewById(R.id.apPersona);
        et3 = (EditText) findViewById(R.id.ap2Persona);
        et4 = (EditText) findViewById(R.id.edad);

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);

        rb1 = (RatingBar) findViewById(R.id.ratingBar);

    }

    public void enviar(View view){
        String nombre_String = et1.getText().toString();
        String ap1 = et2.getText().toString();
        String ap2 = et3.getText().toString();
        String edades = et4.getText().toString();
        int edadint = Integer.parseInt(edades);
        tv1.setText("Enviado formulario de: "+ nombre_String + ap1);
    }
}