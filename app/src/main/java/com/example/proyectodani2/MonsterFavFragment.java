package com.example.proyectodani2;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dam2a on 30/01/18.
 */

public class MonsterFavFragment extends MonsterFragment {





    @Override
    void rellenarLista() {
        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));
        monsters.add(new Monster(R.drawable.rathalos));
    }
}
