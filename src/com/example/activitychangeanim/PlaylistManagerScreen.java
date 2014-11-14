package com.example.activitychangeanim;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PlaylistManagerScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_playlistmanagerscreen);
		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(PlaylistManagerScreen.this,MainActivity.class);
				startActivity(i);
				overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_left);
				
			}
		});
	}

	@Override
	public void onBackPressed() {
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
		super.onBackPressed();
	}
	
	
}
