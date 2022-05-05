package com.example.aplicaciontarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ropa extends AppCompatActivity {
    EditText et1, et2, et3;
    TextView tv1, tv2;
    Button btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ropa);


        et1 = (EditText) findViewById(R.id.editText3);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText1);

        tv1 = (TextView) findViewById(R.id.textView13);
        tv2 = (TextView) findViewById(R.id.textView11);

        btn1 = (Button) findViewById(R.id.button4);
        btn2 = (Button) findViewById(R.id.button3);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ((EditText)findViewById(R.id.editText3)).setText("");
                ((EditText)findViewById(R.id.editText2)).setText("");
                ((EditText)findViewById(R.id.editText1)).setText("");
                tv1.setText("0.0 Bs");
                tv2.setText("0.0 Bs");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            double valor1, valor2, valor3, imp1, iva, to1;

            @Override
            public void onClick(View v) {

                valor1 = Integer.parseInt(et1.getText().toString());
                valor2 = Integer.parseInt(et2.getText().toString());
                valor3 = Integer.parseInt(et3.getText().toString());

                imp1 = valor1 + valor2 + valor3;
                iva = imp1 * 0.13;
                to1 = imp1 + iva;

                tv1.setText(imp1+" Bs");
                tv2.setText(to1+" Bs");
            }
        });
    }
}
