package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by gongkai on 2017/1/17.
 */

public class OrientalPearlFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.name_place_1, R.string.address_place_1, R.drawable.orientalpearl));
        places.add(new Place(R.string.oriental_name_1, R.string.oriental_address_1, R.drawable.suzhezonghui));
        places.add(new Place(R.string.oriental_name_2, R.string.oriental_address_2, R.drawable.kongyiji));
        places.add(new Place(R.string.oriental_name_3, R.string.oriental_address_3, R.drawable.shanghaiinternationalconferencecenter));
        places.add(new Place(R.string.oriental_name_4, R.string.oriental_address_4, R.drawable.wills));
        places.add(new Place(R.string.oriental_name_5, R.string.oriental_address_5, R.drawable.monumenttopeopleshero));
        places.add(new Place(R.string.oriental_name_6, R.string.oriental_address_6, R.drawable.jardinematheson));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
