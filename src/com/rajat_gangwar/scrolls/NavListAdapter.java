package com.rajat_gangwar.scrolls;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NavListAdapter extends BaseAdapter {

	Context context;
	LayoutInflater inflater;
	String[] menu;

	public NavListAdapter(String[] menu, Context context) {
		super();
		this.context = context;
		this.menu = menu;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return menu.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		if (convertView == null) {
			inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.navlist_item, parent, false);
		}
		//RelativeLayout item_Container=(RelativeLayout) convertView.findViewById(R.id.listitem_container);
		
		TextView menuItem = (TextView) convertView.findViewById(R.id.menuItem);
		menuItem.setText(menu[position]);
		return convertView;
	}

}
