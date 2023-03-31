package com.example.fourth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fourth.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.main_fragment, FirstFragment.class, null)
                    .commit();
        }
    }
}