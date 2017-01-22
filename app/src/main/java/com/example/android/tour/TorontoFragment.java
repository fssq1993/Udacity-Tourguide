package com.example.android.tour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by yuanyi on 2017/1/3.
 */

public class TorontoFragment extends android.support.v4.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.toronto_fragment, container, false);
        final ArrayList<item> items=new ArrayList<item>();
        items.add(new item(getString(R.string.toronto_name1),getString(R.string.toronto_location1),getString(R.string.toronto_conten1),R.drawable.eaton));
        items.add(new item(getString(R.string.toronto_name2),getString(R.string.toronto_location2),getString(R.string.toronto_conten2),R.drawable.island_park));


        itemAdapter adapter = new itemAdapter(getActivity(),items);
        ListView listView = (ListView)rootView.findViewById(R.id.list_toronto);
        listView.setAdapter(adapter);

        return rootView;
    }

}
