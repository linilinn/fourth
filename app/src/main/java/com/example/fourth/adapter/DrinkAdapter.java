package com.example.fourth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fourth.R;

import java.util.List;

public class DrinkAdapter extends ArrayAdapter<String> {
    private final Context context;

    private final List<String> items;

    public DrinkAdapter(Context context, List<String> items) {
        super(context, R.layout.drink_item, items);
        this.context = context;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.drink_item, parent, false);

        ImageView imageView6 = view.findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.drink);

        TextView textView12 = view.findViewById(R.id.textView12);
        textView12.setText(items.get(position));

        return view;
    }
}
