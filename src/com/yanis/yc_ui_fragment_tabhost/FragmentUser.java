package com.yanis.yc_ui_fragment_tabhost;

import com.yanis.yc_ui_fragment_tabhost.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentUser extends Fragment {
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
return inflater.inflate(R.layout.fragment_user, container, false);
}
}
