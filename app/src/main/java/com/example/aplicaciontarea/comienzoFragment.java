package com.example.aplicaciontarea;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link comienzoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class comienzoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public comienzoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment comienzoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static comienzoFragment newInstance(String param1, String param2) {
        comienzoFragment fragment = new comienzoFragment();
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
    ImageButton google, facebook, link, youtube;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comienzo, container, false);
        google = view.findViewById(R.id.btngoogle);
        facebook=view.findViewById(R.id.btnfacebook);
        youtube=view.findViewById(R.id.btnvideo);
        link=view.findViewById(R.id.btnlink);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri google = Uri.parse("https://aerobic.guiafitness.com/pasos-basicos-de-aerobic.html");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri youtube = Uri.parse("https://www.youtube.com/watch?v=ZSOBiNmjoFY");
                Intent intent = new Intent(Intent.ACTION_VIEW,youtube);
                startActivity(intent);

            }
        });

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://aprendeconreyhan.org/como-realizar-mi-calculo-calorico/");
                Intent intent = new Intent(Intent.ACTION_VIEW,link);
                startActivity(intent);

            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri facebook = Uri.parse("https://web.facebook.com/milagrosanani.ascuemadrid");
                Intent intent = new Intent(Intent.ACTION_VIEW,facebook);
                startActivity(intent);
            }
        });
        return  view;
    }

}