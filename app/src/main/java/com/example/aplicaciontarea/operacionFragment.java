package com.example.aplicaciontarea;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link operacionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class operacionFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public operacionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment operacionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static operacionFragment newInstance(String param1, String param2) {
        operacionFragment fragment = new operacionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    Button btnSuma, btnResta, btnMultiplicar, btnDividir, btnBorrar, btnIgual, btnPunto, btnPorcentaje, btnClear;
    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve;

    TextView txtResultado;
    double n1=0;
    double n2=0;
    String opera;
    private View view;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_operacion, container, false);
        txtResultado = view.findViewById(R.id.resultado);
        btnSuma = view.findViewById(R.id.suma);
        btnSuma.setOnClickListener((v) -> {
            opera = "+";
            n1 = Integer.parseInt(txtResultado.getText().toString());
            txtResultado.setText("");
        });

        btnResta = view.findViewById(R.id.resta);
        btnResta.setOnClickListener((v) -> {
            opera = "-";
            n1 = Integer.parseInt(txtResultado.getText().toString());
            txtResultado.setText("");
        });

        btnMultiplicar = view.findViewById(R.id.multiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opera = "*";
                n1 = Integer.parseInt(txtResultado.getText().toString());
                txtResultado.setText("");
            }
        });

        btnDividir = view.findViewById(R.id.dividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opera = "/";
                n1 = Integer.parseInt(txtResultado.getText().toString());
                txtResultado.setText("");
            }
        });

        btnPorcentaje = view.findViewById(R.id.Porcentaje);
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opera = "%";
                n1 = Integer.parseInt(txtResultado.getText().toString());
                txtResultado.setText("");
            }
        });

        btnPunto = view.findViewById(R.id.punto);
        btnPunto.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+".");
        });

        btnClear = view.findViewById(R.id.Clear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText("");
            }
        });

        btnBorrar = view.findViewById(R.id.Borrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText("");
            }
        });
        btnCero = view.findViewById(R.id.cero);
        btnCero.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"0");
        });
        btnUno = view.findViewById(R.id.uno);
        btnUno.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"1");
        });
        btnDos = view.findViewById(R.id.dos);
        btnDos.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"2");
        });
        btnTres = view.findViewById(R.id.tres);
        btnTres.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"3");
        });
        btnCuatro = view.findViewById(R.id.cuatro);
        btnCuatro.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"4");
        });
        btnCinco = view.findViewById(R.id.cinco);
        btnCinco.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"5");
        });
        btnSeis = view.findViewById(R.id.seis);
        btnSeis.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"6");
        });
        btnSiete = view.findViewById(R.id.siete);
        btnSiete.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"7");
        });
        btnOcho = view.findViewById(R.id.ocho);
        btnOcho.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"8");
        });
        btnNueve = view.findViewById(R.id.nueve);
        btnNueve.setOnClickListener((v) -> {
            txtResultado.setText(txtResultado.getText()+"9");
        });

        btnIgual = view.findViewById(R.id.igual);
        btnIgual.setOnClickListener((v) -> {
            n2 = Integer.parseInt(txtResultado.getText().toString());
            double op1;
            if(opera == "+"){
                op1 = Suma((n1), (n2));
                txtResultado.setText(op1+"");
            }
            else if (opera == "-"){
                op1 = Resta((n1), (n2));
                txtResultado.setText(op1+"");
            }
            else if (opera == "*"){
                op1 = Multiplicacion((n1), (n2));
                txtResultado.setText(op1+"");
            }
            else if (opera == "/"){
                op1 = Division((n1), (n2));
                txtResultado.setText(op1+"");
            }
            else if (opera == "%"){
                op1 = Porcentaje(n1);
                txtResultado.setText(op1+"");
            }
        });
        return view;
    }
    public double Suma(double n1,double n2){
        Double e;
        e = n1+n2;
        return e;
    }
    public double Resta(double n1,double n2){
        Double e;
        e = n1-n2;
        return e;
    }
    public double Multiplicacion(double n1,double n2){
        Double e;
        e = n1*n2;
        return e;
    }
    public double Division(double n1,double n2){
        Double e;
        e = n1/n2;
        return e;
    }
    public double Porcentaje(double n1){
        Double e;
        e = n1/100;
        return e;


    }
}