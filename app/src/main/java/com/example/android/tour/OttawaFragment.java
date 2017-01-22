package com.example.android.tour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by yuanyi on 2017/1/3.
 */

public class OttawaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ottawa_fragment, container, false);
        final ArrayList<item> items=new ArrayList<item>();
        items.add(new item(getString(R.string.city_name3),getString(R.string.city_location3),getString(R.string.city_conten3),R.drawable.snow));
        items.add(new item(getString(R.string.toronto_name1),getString(R.string.toronto_location1),getString(R.string.toronto_conten1),R.drawable.island_park));


        itemAdapter adapter = new itemAdapter(getActivity(),items);
        ListView listView = (ListView)rootView.findViewById(R.id.list_ottawa);
        listView.setAdapter(adapter);

        return rootView;
    }
}
