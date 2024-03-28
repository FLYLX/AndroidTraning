package com.example.helloworld.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;

public class StaggeredGridAdapter extends RecyclerView.Adapter<StaggeredGridAdapter.LinearViewHolder> {
    private Context mContext;
    private StaggeredGridAdapter.OnItemClickListener mListener;

    public StaggeredGridAdapter(Context context, StaggeredGridAdapter.OnItemClickListener listener){

        this.mContext = context;
        this.mListener = listener;
    }
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new StaggeredGridAdapter.LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggered_grid_recycler_item,parent,false));

    }

    @Override
    public void onBindViewHolder(StaggeredGridAdapter.LinearViewHolder holder, @SuppressLint("RecyclerView") int position) {
        if(position % 2 ==0){
            holder.imageView.setImageResource(R.drawable.bg_cigerette);
        }else{
            holder.imageView.setImageResource(R.drawable.ic_launcher_background);
        }

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
        private ImageView imageView;
        public LinearViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_123);


        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);

    }
}