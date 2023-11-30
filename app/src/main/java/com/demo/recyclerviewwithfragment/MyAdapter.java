package com.demo.recyclerviewwithfragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.demo.recyclerviewwithfragment.Model.MyData;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private final Context context;
    private final List<MyData> dataset;

    public MyAdapter(Context context, List<MyData> dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(dataset.get(position).getStringResourceId());
        holder.imageView.setImageResource(dataset.get(position).getImageResourceId());

        holder.cardView.setOnClickListener(view -> {

            Intent intent = new Intent(context, OpenNewActivity.class);
            intent.putExtra("StringResourceId", dataset.get(position).getStringResourceId());
            intent.putExtra("ImageResourceId", dataset.get(position).getImageResourceId());
            context.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.text_title);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
