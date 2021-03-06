package com.rajat_gangwar.scrolls;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class About extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = (View) inflater.inflate(R.layout.fragment_about,
				container, false);
		TextView tv_about1 = (TextView) rootView.findViewById(R.id.textView1);
		TextView tv_about2 = (TextView) rootView.findViewById(R.id.textView2);
		TextView tv_about3 = (TextView) rootView.findViewById(R.id.textView3);
		Typeface tf = Typeface.createFromAsset(getActivity().getAssets(),
				"fonts/Roboto-Regular.ttf");
		tv_about1.setTypeface(tf);
		tv_about2.setTypeface(tf);
		tv_about3.setTypeface(tf);
		return rootView;
	}
}
