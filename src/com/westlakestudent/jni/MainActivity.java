package com.westlakestudent.jni;

import com.cd.jni.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView  text = (TextView) findViewById(R.id.text);
		text.setText(fromjni());
	}

	static{
		System.loadLibrary("hello-jni");
	}
	
	public static native String fromjni();
}
