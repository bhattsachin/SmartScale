package com.example.smartscale;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.fitometer.fragments.ConfigureFragment;
import com.fitometer.fragments.TodayFragment;

public class MainActivity extends SherlockFragmentActivity {
	
	RadioButton todayBtn;
	RadioButton profileBtn;
	RadioButton configureBtn;
	RadioButton feedBtn;
	RadioGroup tabs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		todayBtn = (RadioButton)findViewById(R.layout.today_fragment);
		profileBtn = (RadioButton)findViewById(R.layout.profile_fragment);
		configureBtn = (RadioButton)findViewById(R.layout.configure_fragment);
		feedBtn = (RadioButton)findViewById(R.layout.feed_fragment);
		 tabs = (RadioGroup) findViewById(R.id.AllTabs);
		 
		 
		 
		 
		 
		 
		 
		 tabs.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(RadioGroup group, int checkedId) {
					// TODO Auto-generated method stub
					
					 switch (checkedId) {
	                 case R.id.RadioButton1:
	                 	todayBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.radio_shape_new));
	                 	profileBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.radio_shape));
	                 	configureBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.radio_shape));
	                 	feedBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.radio_shape));
	                	
	                	TodayFragment explorefragment = new TodayFragment();
	             		FragmentManager fm = getSupportFragmentManager();
	             		FragmentTransaction ft = fm.beginTransaction();
	             	    ft.replace(R.id.frame_fragment, explorefragment).addToBackStack(null).commit();
	             	   FragmentTransaction f = getSupportFragmentManager().beginTransaction();
	             	   //f.add(R.id.maps, et).addToBackStack(null).commit();
	             	    
	             	    break;
	                 case R.id.RadioButton2:
	                 	todayBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.radio_shape));
	                 	profileBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.radio_shape));
	                 	configureBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.radio_shape));
	                 	feedBtn.setBackgroundDrawable(getResources().getDrawable(R.drawable.radio_shape_new));

	                	 ConfigureFragment donatefragment = new ConfigureFragment();
	             		FragmentManager fmi = getSupportFragmentManager();
	             		FragmentTransaction fti = fmi.beginTransaction();
	             		fti.replace(R.id.frame_fragment, donatefragment).addToBackStack(null).commit();
	                    break;
	               
	             
			          }
								
					}
				});
		
	}

	

}
