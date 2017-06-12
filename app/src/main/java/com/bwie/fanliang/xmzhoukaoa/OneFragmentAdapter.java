package com.bwie.fanliang.xmzhoukaoa;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by fanliang on 2017/6/11.
 */
public class OneFragmentAdapter extends BaseAdapter{

    private Context context;
    public OneFragmentAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        OneViewHolder oneViewHolder;
        if (view == null){

            oneViewHolder = new OneViewHolder();

            view = View.inflate(context, R.layout.one_item, null);
            oneViewHolder.imageView = (ImageView) view.findViewById(R.id.one_image);
            oneViewHolder.title = (TextView) view.findViewById(R.id.one_title);
            oneViewHolder.datas = (TextView) view.findViewById(R.id.one_datas);

            view.setTag(oneViewHolder);

        }else{

            oneViewHolder = (OneViewHolder) view.getTag();

        }

        return view;
    }

    class OneViewHolder{

        ImageView imageView;
        TextView title;
        TextView datas;


    }

}
