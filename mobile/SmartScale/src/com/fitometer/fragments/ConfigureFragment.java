package com.fitometer.fragments;



import com.example.smartscale.R;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;

public class ConfigureFragment extends Fragment implements OnClickListener {

	WebView webView;

	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.configure_fragment, container, false);
		//RelativeLayout relate = (RelativeLayout) v.findViewById(R.id.relative_lay);
		webView = (WebView) v.findViewById(R.id.configureWebView);

		
			
		return v;
		//return v;
	}
	
	private class LongOperation extends AsyncTask<String, Void, String> {

		@SuppressLint({ "NewApi", "SetJavaScriptEnabled" })
		@Override
		protected String doInBackground(String... arg0) {

			String url = "http://www.google.com";
			
			 return url;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
			webView.loadUrl(result);
			
			//webview.loadData(temp, "text/html", "utf-8");

		}
	
	
	
}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
