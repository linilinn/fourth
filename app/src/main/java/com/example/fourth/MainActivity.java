package com.example.fourth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.fourth.fragments.FirstFragment;
import com.example.fourth.fragments.SecondFragment;
import com.example.fourth.fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    Fragment firstFragment, secondFragment, thirdFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();

        if (savedInstanceState == null) {
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().setReorderingAllowed(true).add(R.id.main_fragment, FirstFragment.class, null).commit();
        }
    }

    public void changeFragment(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (view.getId() == R.id.button) {
            if (secondFragment.isVisible()) {
                return;
            }
            fragmentTransaction.replace(R.id.main_fragment, secondFragment);
        }
        if (view.getId() == R.id.button2) {
            if (thirdFragment.isVisible()) {
                return;
            }
            fragmentTransaction.replace(R.id.main_fragment, thirdFragment);
        }
        fragmentTransaction.commit();
    }
}