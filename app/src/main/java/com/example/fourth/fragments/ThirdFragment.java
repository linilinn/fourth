package com.example.fourth.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fourth.MainActivity;
import com.example.fourth.R;
import com.example.fourth.adapter.DrinkAdapter;
import com.example.fourth.adapter.Food;
import com.example.fourth.adapter.FoodAdapter;
import com.example.fourth.databinding.FragmentSecondBinding;
import com.example.fourth.databinding.FragmentThirdBinding;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {
    MainActivity mainActivity;
    FragmentThirdBinding binding;
    FragmentManager fragmentManager;
    public ThirdFragment() {
        super(R.layout.fragment_third);
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        generateElements();
    }

    private void generateElements() {
        List<Food> food = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            Food temp = new Food("Блюдо " + i, R.drawable.food);
            food.add(temp);
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(mainActivity, RecyclerView.VERTICAL, false);
        binding.recyclerView.setLayoutManager(layoutManager);
        FoodAdapter foodAdapter = new FoodAdapter(food);
        binding.recyclerView.setAdapter(foodAdapter);
    }
}