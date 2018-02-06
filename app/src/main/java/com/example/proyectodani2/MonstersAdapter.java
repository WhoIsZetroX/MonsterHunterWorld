package com.example.proyectodani2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dam2a on 30/01/18.
 */

public class MonstersAdapter extends RecyclerView.Adapter<MonsterViewHolder> {

    List<Monster> monsters;
    Context context;

    MonstersAdapter(Context context, List<Monster> monsters) {
        this.context = context;
        this.monsters = monsters;
    }

    @Override
    public MonsterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_monster, null, false);
        return new MonsterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MonsterViewHolder holder, int position) {
        Monster monster = monsters.get(position);

        //holder.name.setText(monster.name);
        holder.image.setImageDrawable(context.getResources().getDrawable(monster.imageUrl));
    }

    @Override
    public int getItemCount() {
        return monsters.size();
    }
}
