package com.example.fourth.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.fourth.MainActivity;
import com.example.fourth.R;
import com.example.fourth.adapter.Drink;
import com.example.fourth.adapter.DrinkAdapter;
import com.example.fourth.databinding.FragmentSecondBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {
    MainActivity mainActivity;
    @NonNull FragmentSecondBinding binding;
    public SecondFragment() {
        super(R.layout.fragment_second);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        generateElements();
    }

    private void generateElements() {
        List<String> drinks = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            drinks.add("Напиток " + i);
        }
        DrinkAdapter drinkAdapter = new DrinkAdapter(mainActivity, drinks);
        binding.listView.setAdapter(drinkAdapter);
        binding.listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Log.i("ListView", "ListView is clicked");
            Toast.makeText(mainActivity, "ListView is clicked", Toast.LENGTH_LONG).show();
        });
    }
}