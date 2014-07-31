package com.rajat_gangwar.scrolls;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Navigation extends Fragment {
	GoogleMap Map;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = (View) inflater.inflate(R.layout.fragment_navigation,
				container, false);
		MapFragment fm = (MapFragment) getFragmentManager().findFragmentById(
				R.id.map);

		// Getting GoogleMap object from the fragment
		Map = fm.getMap();

		// Enabling MyLocation Layer of Google Map
		Map.setMyLocationEnabled(true);
		// LatLng object to store user input coordinates
		LatLng point = new LatLng(28.675751, 77.502818);

		// Drawing the marker at the coordinates
		drawMarker(point);
		return rootView;
	}

	// protected void onCreate(Bundle arg0) {
	// // TODO Auto-generated method stub
	// super.onCreate(arg0);
	// int status =
	// GooglePlayServicesUtil.isGooglePlayServicesAvailable(getBaseContext());
	//
	// // Showing status
	// if(status!=ConnectionResult.SUCCESS){ // Google Play Services are not
	// available
	//
	// int requestCode = 10;
	// Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status,
	// getParent(), requestCode);
	// dialog.show();
	//
	// }else { // Google Play Services are available
	//
	// // Getting reference to the SupportMapFragment of activity_main.xml
	// SupportMapFragment fm = (SupportMapFragment)
	// getFragmentManager().findFragmentById(R.id.map);
	//
	// // Getting GoogleMap object from the fragment
	// Map = fm.getMap();
	//
	// // Enabling MyLocation Layer of Google Map
	// Map.setMyLocationEnabled(true);
	//
	// // LatLng object to store user input coordinates
	// LatLng point = new LatLng(28.675751,77.502818);
	//
	// // Drawing the marker at the coordinates
	// drawMarker(point);
	// }
	// }
	private void drawMarker(LatLng point) {
		// Clears all the existing coordinates
		Map.clear();

		// Creating an instance of MarkerOptions
		MarkerOptions markerOptions = new MarkerOptions();

		// Setting latitude and longitude for the marker
		markerOptions.position(point);

		// Setting title for the InfoWindow
		markerOptions.title("Position");

		// Setting InfoWindow contents
		markerOptions.snippet("Latitude:" + point.latitude + ",Longitude"
				+ point.longitude);

		// Adding marker on the Google Map
		Map.addMarker(markerOptions);

		// Moving CameraPosition to the user input coordinates
		Map.moveCamera(CameraUpdateFactory.newLatLngZoom(point, 15));

	}

}
