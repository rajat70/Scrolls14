package com.rajat_gangwar.scrolls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Topics extends Fragment {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View rootView = (View) inflater.inflate(R.layout.fragment_topics,
				container, false);

		expListView = (ExpandableListView) rootView.findViewById(R.id.expLv);

		prepareListData();

		listAdapter = new MyAdapter(getActivity(),listDataHeader, listDataChild);

		expListView.setAdapter(listAdapter);
		expListView.setOnGroupExpandListener(new OnGroupExpandListener() {
			 
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getActivity(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });
 		return rootView;
		}
	

	public void prepareListData() {
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();
		List<String> list_me = new ArrayList<String>();
		List<String> list_cs = new ArrayList<String>();
		List<String> list_en = new ArrayList<String>();
		List<String> list_ec = new ArrayList<String>();
		List<String> list_ms = new ArrayList<String>();
		String[] domain = getResources().getStringArray(R.array.domain);
		String[] items_me = getResources().getStringArray(R.array.items_me);
		String[] items_cs = getResources().getStringArray(R.array.items_cs);
		String[] items_en = getResources().getStringArray(R.array.items_en);
		String[] items_ms = getResources().getStringArray(R.array.items_ms);
		String[] items_ec = getResources().getStringArray(R.array.items_ec);
		for (int i = 0; i < domain.length; i++)
			listDataHeader.add(domain[i]);
		for (int i = 0; i < items_me.length; i++)
			list_me.add(items_me[i]);
		for (int i = 0; i < items_cs.length; i++)
			list_cs.add(items_cs[i]);
		for (int i = 0; i < items_en.length; i++)
			list_en.add(items_en[i]);
		for (int i = 0; i < items_ec.length; i++)
			list_ec.add(items_ec[i]);
		for (int i = 0; i < items_ms.length; i++)
			list_ec.add(items_ms[i]);

		listDataChild.put(listDataHeader.get(0), list_me);
		listDataChild.put(listDataHeader.get(1), list_cs);
		listDataChild.put(listDataHeader.get(2), list_ec);
		listDataChild.put(listDataHeader.get(3), list_en);
		listDataChild.put(listDataHeader.get(4), list_ms);

	}
	
	
}
