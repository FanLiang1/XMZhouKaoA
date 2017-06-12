package com.bwie.fanliang.xmzhoukaoa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by fanliang on 2017/6/11.
 */
public class OneFragment extends android.support.v4.app.Fragment {

    private ListView one_lv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onefragment, container, false);

        one_lv = (ListView) view.findViewById(R.id.onefragment_lv);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        OneFragmentAdapter adapter = new OneFragmentAdapter(getActivity());

        one_lv.setAdapter(adapter);

        one_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), TwoActivity.class);

                intent.putExtra("title","主演:周星驰");
                intent.putExtra("datas","讲述了一段凄婉的神话爱情故事");

                startActivity(intent);


            }
        });


    }
}
