package com.test.striker.chennaiguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.word_list,container,false);

            final ArrayList<Word> words = new ArrayList<>();
            words.add(new Word("ITC Grand Chola","A 5 star hotel with restaurant bar and a pool","5"));
            words.add(new Word("The Park Hotel","A great hotel with all facilities ","4.6"));
            words.add(new Word("Lemon Tree","A good experience with exotic design","4.4"));

            words.add(new Word("ITC Grand Chola","A 5 star hotel with restaurant bar and a pool","5"));
            words.add(new Word("The Park Hotel","A great hotel with all facilities ","4.6"));
            words.add(new Word("Lemon Tree","A good experience with exotic design","4.4"));

            words.add(new Word("ITC Grand Chola","A 5 star hotel with restaurant bar and a pool","5"));
            words.add(new Word("The Park Hotel","A great hotel with all facilities ","4.6"));
            words.add(new Word("Lemon Tree","A good experience with exotic design","4.4"));

            WordAdapter adapter = new WordAdapter(getActivity(),words);
            ListView listView = (ListView) rootView.findViewById(R.id.list);
            listView.setAdapter(adapter);
            MainActivity.viewAtHome = true;

            return rootView;
        }

    }
