package com.bwie.fanliang.xmzhoukaoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanliang on 2017/6/11.
 */
public class TwoFragment extends android.support.v4.app.Fragment {
    private RecyclerView recycleview;
    private List<Integer> mlist;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.twofragment, container, false);

        recycleview = (RecyclerView) view.findViewById(R.id.recycleview);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);

        recycleview.setLayoutManager(staggeredGridLayoutManager);

        TwoFragmentAdapter adapter = new TwoFragmentAdapter(getActivity(),mlist);

        recycleview.setAdapter(adapter);

    }

    private void initData() {
        mlist = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            mlist.add(R.mipmap.ic_launcher);
        }
    }
}
