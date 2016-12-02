package nodev.survivalskills;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

	public static String PACKAGE_NAME;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		PACKAGE_NAME = getApplicationContext().getPackageName();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent mainIntent = new Intent(getBaseContext(), MainActivity.class);
				startActivity(mainIntent);
			}
		}, 3000);
	}

	@Override
	protected void onResume() {
		super.onResume();

	}
}
