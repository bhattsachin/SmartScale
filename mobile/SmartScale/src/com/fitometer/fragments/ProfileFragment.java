package com.fitometer.fragments;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class ProfileFragment extends Fragment implements OnClickListener {



	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//View v = inflater.inflate(R.layout.about_fragment, container, false);
		//RelativeLayout relate = (RelativeLayout) v.findViewById(R.id.relative_lay);
		//webview = (WebView) v.findViewById(R.id.videoview);

		
			
		return null;
		//return v;
	}
	
	private class LongOperation extends AsyncTask<String, Void, String> {

		@SuppressLint({ "NewApi", "SetJavaScriptEnabled" })
		@Override
		protected String doInBackground(String... arg0) {

			
			
			 return null;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
		
			//webview.loadData(temp, "text/html", "utf-8");

		}
	
	
	
}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
