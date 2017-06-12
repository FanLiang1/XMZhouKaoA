package com.bwie.fanliang.xmzhoukaoa;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.Random;

/**
 * Created by fanliang on 2017/6/11.
 */
public class TwoFragmentAdapter extends RecyclerView.Adapter<TwoFragmentAdapter.MyViewHolder> {
    Context context;
    List<Integer> mlist;
    public TwoFragmentAdapter(Context context, List<Integer> mlist) {
        this.context = context;
        this.mlist = mlist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.two_item, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ViewGroup.LayoutParams params=holder.tv.getLayoutParams();
        Random random = new Random();
        params.height = random.nextInt(100);
        holder.tv.setLayoutParams(params);
       // holder.tv.setText(mlist.get(position));
        Glide.with(context).load(mlist.get(position));
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    //找到布局中空间位置
    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView tv;

        public MyViewHolder(View arg0) {
            super(arg0);

            tv = (ImageView) arg0.findViewById(R.id.id_num);
        }
    }
}
