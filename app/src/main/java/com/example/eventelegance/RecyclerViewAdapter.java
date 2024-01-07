package com.example.eventelegance;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    int[] arr;

    public RecyclerViewAdapter(int[] arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(arr[position]);
        holder.textView.setText("Image: " + position);

        //display toast message after clicking on image:
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), "Image: " + position, Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    //Toast.makeText(v.getContext(), "Child's Birthday Celebration", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(v.getContext(), DisplayImages.class);
                    //v.getContext().startActivity(intent);

                    Toast.makeText(v.getContext(), "Child's Birthday Celebration" + " Cost: R15000", Toast.LENGTH_LONG).show();
                }
                else if (position == 1) {
                    //Toast.makeText(v.getContext(), "Adult's Birthday Celebration", Toast.LENGTH_SHORT).show();
                    ///Intent intent = new Intent(v.getContext(), DisplayImages.class);
                    //v.getContext().startActivity(intent);

                    Toast.makeText(v.getContext(), "Adult's Birthday Celebration" + " Cost: R20000", Toast.LENGTH_LONG).show();

                }
                else if (position == 2 || position == 3) {
                    //Toast.makeText(v.getContext(), "Wedding", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(v.getContext(), DisplayImages.class);
                    //v.getContext().startActivity(intent);

                    Toast.makeText(v.getContext(), "Wedding" + " Cost: R35000", Toast.LENGTH_LONG).show();
                }
                else if (position == 4) {
                    //Toast.makeText(v.getContext(), "Other Function", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(v.getContext(), DisplayImages.class);
                    //v.getContext().startActivity(intent);

                    Toast.makeText(v.getContext(), "Anniversary" + " Cost: R10000", Toast.LENGTH_LONG).show();
                }
                else if (position == 5) {
                    //Toast.makeText(v.getContext(), "Other Function", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(v.getContext(), DisplayImages.class);
                    //v.getContext().startActivity(intent);

                    Toast.makeText(v.getContext(), "Concert" + " Cost: R25000", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
