package com.rajat_gangwar.scrolls;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends FragmentActivity implements
		OnItemClickListener {
	String menu[] = { "About", "Login", "Topics", "Rules", "Date", "Synopsis",
			"Navigation", "Contact", "Query" };
	ListView list;
	DrawerLayout drawer;
	ActionBarDrawerToggle drawerToggle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list = (ListView) findViewById(R.id.drawer);
		drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

		Fragment f = new About();
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction().replace(R.id.content, f).commit();
		drawerToggle = new ActionBarDrawerToggle(this, drawer,
				R.drawable.ic_launcher, R.string.drawerOpenedText,
				R.string.drawerClosedText) {

			@Override
			public void onDrawerClosed(View drawerView) {
				// TODO Auto-generated method stub
				super.onDrawerClosed(drawerView);
			}

			@Override
			public void onDrawerOpened(View drawerView) {
				// TODO Auto-generated method stub
				super.onDrawerOpened(drawerView);
			}

		};

		// drawer.setDrawerListener(drawerToggle);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		drawer.openDrawer(list);
		list.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, menu));
		// Set the list's click listener
		list.setOnItemClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view,
			final int position, long id) {
		// TODO Auto-generated method stub
		// Toast.makeText(this,menu[position],Toast.LENGTH_SHORT).show();
		// selectitem(position);
		// String item=menu[position];
		//
		// try {
		// Class choice=Class.forName("com.example.scrolls_test2."+item);
		// Intent newActivity=new Intent(MainActivity.this,choice);
		// startActivity(newActivity);
		// } catch (ClassNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		drawer.setDrawerListener(new DrawerLayout.SimpleDrawerListener() {
			@Override
			public void onDrawerClosed(View drawerView) {
				super.onDrawerClosed(drawerView);
				FragmentTransaction tx;
				tx = getFragmentManager().beginTransaction();
				tx.replace(R.id.content, Fragment.instantiate(
						MainActivity.this, "com.rajat_gangwar.scrolls."
								+ menu[position]));
				tx.commit();
			}
		});

		drawer.closeDrawer(list);
	}

	public void selectitem(int position) {
		list.setItemChecked(position, true);
		settitle(menu[position]);

	}

	public void settitle(String title) {
		getActionBar().setTitle(title);
	}
}
