package com.example.fourth.adapter;

import static android.app.PendingIntent.getActivity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fourth.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private List<Food> foodList;


    public FoodAdapter(List<Food> bookList) {
        this.foodList = bookList;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public FoodViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView4);
            textView = itemView.findViewById(R.id.textView13);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.textView.setText(food.getFood());
        holder.imageView.setImageResource(food.getImageResource());
        holder.itemView.setOnClickListener(view -> {
            Log.i("RecyclerView", "RecyclerView is clicked");
            Toast.makeText(view.getContext(), "RecyclerView is clicked", Toast.LENGTH_LONG).show();
        });
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView13);
            imageView = (ImageView) itemView.findViewById(R.id.imageView4);
        }
    }
}
