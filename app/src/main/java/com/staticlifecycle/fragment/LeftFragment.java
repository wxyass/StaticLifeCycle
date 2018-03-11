package com.staticlifecycle.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.staticlifecycle.R;

import java.util.ArrayList;


public class LeftFragment extends Fragment {
	private ListView listView;
	private ArrayList<String> dataList;

	// 创建Fragment要展示的布局效果
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.left_fragment, null);
		listView = (ListView) view.findViewById(R.id.listView);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		initData();
		// 设置数据适配器
		listView.setAdapter(new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, dataList));
	}

	private void initData() {
		dataList = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			dataList.add("我是left_Fragment中的数据" + i);
		}
	}
}
