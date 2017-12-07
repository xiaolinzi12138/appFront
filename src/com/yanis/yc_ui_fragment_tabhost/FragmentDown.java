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


public class FragmentDown extends Fragment {
	private WebView webview;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_down, container, false);
		webview = (WebView) view.findViewById(R.id.webview2);
		webview.loadUrl("http://www.baidu.com");

		// 重写WebViewClient的shouldOverrideUrlLoading方法，实现在webview内加载网页
		webview.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});
		
	    //点击后退按钮,让WebView后退一页(也可以覆写Activity的onKeyDown方法)  
		webview.setOnKeyListener(new View.OnKeyListener() {      
		    @Override      
		    public boolean onKey(View v, int keyCode, KeyEvent event) {      
		        if (event.getAction() == KeyEvent.ACTION_DOWN) {      
		            if (keyCode == KeyEvent.KEYCODE_BACK && webview.canGoBack()) {  //表示按返回键   
		                webview.goBack();   //后退      
		  
		                //webview.goForward();//前进    
		                return true;    //已处理      
		            }      
		        }      
		        return false;      
		    }      
		});    
	return view;
	}
	
}
