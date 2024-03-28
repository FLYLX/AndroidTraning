package com.example.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return 24;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            view = mLayoutInflater.inflate(R.layout.layout_grid_item,null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.iv_grid);
            viewHolder.textView = view.findViewById(R.id.tv_title);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.textView.setText("AfterHello");
        Glide.with(mContext).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fp2.ssl.qhimgs1.com%2Fbdr%2F460__%2Ft01c4d9fa5f497b5abc.jpg&refer=http%3A%2F%2Fp2.ssl.qhimgs1.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1651209500&t=7cd0444fa7dadcb8f4477424d9469abc").into(viewHolder.imageView);
        return view;
    }
}
