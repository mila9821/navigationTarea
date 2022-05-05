package com.example.aplicaciontarea;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link entrenamientoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class entrenamientoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public entrenamientoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment entrenamientoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static entrenamientoFragment newInstance(String param1, String param2) {
        entrenamientoFragment fragment = new entrenamientoFragment();
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
    ImageButton music, aerobic, funcion, rop;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_entrenamiento, container, false);
        music=view.findViewById(R.id.car1);
        aerobic=view.findViewById(R.id.car2);
        funcion=view.findViewById(R.id.car3);
        rop=view.findViewById(R.id.car4);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudioM();
            }
        });
        aerobic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejercicio();
            }
        });
        funcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejercicioF();
            }
        });
        rop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carrito();
            }
        });
        return view;
    }
    private void LlamarAudioM()
    {
        Intent intent = new Intent(entrenamientoFragment.this.getActivity(), Musica.class);
        startActivity(intent);
    }
    private void carrito(){
        Intent intent = new Intent(entrenamientoFragment.this.getActivity(), ropalista.class);
        startActivity(intent);
    }
    private void ejercicio(){
        Intent intent = new Intent(entrenamientoFragment.this.getActivity(), aerobicos.class);
        startActivity(intent);
    }
    private void ejercicioF(){
        Intent intent = new Intent(entrenamientoFragment.this.getActivity(), funcional.class);
    }

}