package com.example.aplicaciontarea.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.aplicaciontarea.R;
import com.example.aplicaciontarea.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    ImageButton google, link, facebook, youtube;

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textView2;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
        
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}