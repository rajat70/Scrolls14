package com.rajat_gangwar.scrolls;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class Topics extends Fragment implements OnItemSelectedListener {

	
	ListView topics;
	Spinner spinner;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View rootView = (View) inflater.inflate(R.layout.fragment_topics,
				container, false);
	
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				getActivity(), R.array.domain,
				android.R.layout.simple_spinner_item);
		
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);
		
		return rootView;
	}

	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		ArrayAdapter<CharSequence> adapter;
		switch (position) {
		case 0:
			adapter = ArrayAdapter.createFromResource(getActivity(),
					R.array.items_me,android.R.layout.simple_list_item_1);
			topics.setAdapter(adapter);
			break;
		case 1:
			adapter = ArrayAdapter.createFromResource(getActivity(),
					R.array.items_cs, android.R.layout.simple_list_item_1);
			topics.setAdapter(adapter);
			break;
		case 2:
			adapter = ArrayAdapter.createFromResource(getActivity(),
					R.array.items_ec, android.R.layout.simple_list_item_1);
			topics.setAdapter(adapter);
			break;
		case 3:
			adapter = ArrayAdapter.createFromResource(getActivity(),
					R.array.items_en, android.R.layout.simple_list_item_1);
			topics.setAdapter(adapter);
			break;
		case 4:
			adapter = ArrayAdapter.createFromResource(getActivity(),
					R.array.items_ms, android.R.layout.simple_list_item_1);
			topics.setAdapter(adapter);
			break;
		}

	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub

	}
}
