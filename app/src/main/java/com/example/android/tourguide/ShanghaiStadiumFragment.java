package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by gongkai on 2017/1/19.
 */

public class ShanghaiStadiumFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.name_place_3, R.string.address_place_3));
        places.add(new Place(R.string.stadium_name_1, R.string.stadium_address_1));
        places.add(new Place(R.string.stadium_name_2, R.string.stadium_address_2));
        places.add(new Place(R.string.stadium_name_3, R.string.stadium_address_3));
        places.add(new Place(R.string.stadium_name_4, R.string.stadium_address_4));
        places.add(new Place(R.string.stadium_name_5, R.string.stadium_address_5));
        places.add(new Place(R.string.stadium_name_6, R.string.stadium_address_6));
        places.add(new Place(R.string.stadium_name_7, R.string.stadium_address_7));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
