package com.rajat_gangwar.scrolls;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Contact extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView=(View) inflater.inflate(R.layout.fragment_contact, container,false);
		return rootView;
	}
	

}
