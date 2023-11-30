package com.demo.recyclerviewwithfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.recyclerviewwithfragment.Model.DataSource;
import com.demo.recyclerviewwithfragment.Model.MyData;

import java.util.List;

public class FragmentA extends Fragment {

    public FragmentA() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_a, container, false);

        List<MyData> myDataset = new DataSource().loadDataSourceForFragA();
        recyclerView = view.findViewById(R.id.RecyclerViewFragA);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        MyAdapter myAdapter = new MyAdapter( requireContext(), myDataset);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}