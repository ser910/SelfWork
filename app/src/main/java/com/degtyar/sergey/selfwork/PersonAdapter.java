package com.degtyar.sergey.selfwork;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by student on 23.11.2016.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    List<PersonInfo> dataset;
    RecyclerViewCallback callback;
    Context context;

    public PersonAdapter(Context context, List<PersonInfo> dataset, RecyclerViewCallback callback) {
        this.dataset = dataset;
        this.callback = callback;
        this.context = context;
    }

    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PersonAdapter.ViewHolder holder, final int position) {
        Picasso.with(context).load(dataset.get(position).getImage_url()).into(holder.imageView);
        holder.nameView.setText(dataset.get(position).getName());
        holder.item.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                callback.onClick(position);
            }

        });
        holder.item.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                callback.onLongClick(position);
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameView;
        TextView emailView;
        LinearLayout item;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById((R.id.list_item_image));
            nameView = (TextView) itemView.findViewById(R.id.list_item_name);
            emailView = (TextView) itemView.findViewById(R.id.list_item_email);
            item = (LinearLayout) itemView.findViewById(R.id.list_item);
        }
    }
}
