package com.example.helloworld.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder> {
    private Context mContext;
    private LinearAdapter.OnItemClickListener mListener;

    public GridAdapter(Context context, LinearAdapter.OnItemClickListener listener){

        this.mContext = context;
        this.mListener = listener;
    }
    @Override
    public GridAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new GridAdapter.LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_recycler_item,parent,false));

    }

    @Override
    public void onBindViewHolder(GridAdapter.LinearViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.textView.setText("Hello World!");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {

        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public LinearViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.rv_title);

        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);

    }
}