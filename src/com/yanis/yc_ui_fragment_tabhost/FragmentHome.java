package com.yanis.yc_ui_fragment_tabhost;

import com.yanis.yc_ui_fragment_tabhost.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FragmentHome extends Fragment {

	private WebView webview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_home, container, false);
		webview = (WebView) view.findViewById(R.id.webview1);
		webview.loadUrl("file:///android_asset/menu.html");
//		webview.loadUrl("http://192.168.66.25:8080/appModelBack/Androidres/menu.html");
		
		// 设置webviewAPP内加载网页
		webview.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});
		// 重写返回键，设置返回键返回webview上一级而不是直接退出应用
		webview.setOnKeyListener(new View.OnKeyListener() {
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				if (event.getAction() == KeyEvent.ACTION_DOWN) {
					if (keyCode == KeyEvent.KEYCODE_BACK && webview.canGoBack()) { 
						webview.goBack(); // 后退
						return true; 
					}
				}
				return false;
			}
		});
		return view;
	}

}
