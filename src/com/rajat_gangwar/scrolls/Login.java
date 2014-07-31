package com.rajat_gangwar.scrolls;

//import com.rajat_gangwar.scrolls.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Login extends Fragment {

	
    @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.fragment_login, container,false);
        return rootView;
   }
}
