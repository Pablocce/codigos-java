package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText resultado;
    private EditText newNumber;
    private TextView displayOperation;

    //Variables para mantener los operadores y el tipo de calculo
    private Double operand1 = null;
    private Double operand2 = null;
    private String pendingOperation = "=";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (EditText) findViewById(R.id.result);
        newNumber = (EditText) findViewById(R.id.newNumber);
        displayOperation = (TextView) findViewById(R.id.textViewOperacion);

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonDot = (Button) findViewById(R.id.buttonPunto);

        Button buttonIgual = (Button) findViewById(R.id.buttonIgual);
        Button buttonDivision = (Button) findViewById(R.id.buttonDivision);
        Button buttonMultiplicacion= (Button) findViewById(R.id.buttonMultiplicacion);
        Button buttonRestar = (Button) findViewById(R.id.buttonRestar);
        Button buttonSumar = (Button) findViewById(R.id.buttonSuma);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                newNumber.append(b.getText().toString());
            }
        };
        button0.setOnClickListener(listener);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        buttonDot.setOnClickListener(listener);

        View.OnClickListener opListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                String op = b.getText().toString();
                String value = newNumber.getText().toString();
                if (value.length()!=0){
                    performOperation(value,op);
                }
                pendingOperation = op;
                displayOperation.setText(pendingOperation);

            }
        };

        buttonIgual.setOnClickListener(opListener);
        buttonDivision.setOnClickListener(opListener);
        buttonMultiplicacion.setOnClickListener(opListener);
        buttonRestar.setOnClickListener(opListener);
        buttonSumar.setOnClickListener(opListener);
    }

    private void performOperation(String value, String op){
        if(null == operand1){
            operand1 = Double.valueOf(value);
        }else{
            operand2 = Double.valueOf(value);

            if(pendingOperation.equals("=")){
                pendingOperation = op;
            }
            switch (pendingOperation){
                case "=":
                    operand1 = operand2;
                    break;
                case "/":
                    if (operand2 == 0){
                        operand1 = 0.0;
                    }else{
                        operand1 /= operand2;
                    }
                    break;
                case "*":
                    operand1 *= operand2;
                    break;
                case "-":
                    operand1 -= operand2;
                    break;
                case "+":
                    operand1 += operand2;
                    break;
            }
        }

        resultado.setText(operand1.toString());
        newNumber.setText("");

    }

}