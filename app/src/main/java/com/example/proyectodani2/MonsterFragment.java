package com.example.proyectodani2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public abstract class MonsterFragment extends Fragment {

    RecyclerView recyclerView;
    List<Monster> monsters = new ArrayList<>();

    public MonsterFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_monster, container, false);

        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));


        MonstersAdapter adapter = new MonstersAdapter(getActivity(), monsters);
        recyclerView.setAdapter(adapter);



        return view;
    }

}
