package com.example.pro.test;

import com.robotium.solo.Solo;

import android.os.Debug;
import android.test.ActivityInstrumentationTestCase2;

@SuppressWarnings("rawtypes")
public class MainActivityTest extends ActivityInstrumentationTestCase2 {

	private Solo solo;

	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.example.pro.MainActivity";

	private static Class<?> launcherActivityClass;
	static {
		try {
			launcherActivityClass = Class
					.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public MainActivityTest() throws ClassNotFoundException {
		super(launcherActivityClass);
	}

	public void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
		super.tearDown();
	}
	

	public void testRun() {
		
	
		// Wait for activity: 'com.example.library1.MainActivity'
		solo.waitForActivity("MainActivity", 2000);
	
		solo.clickOnView(solo.getView("checkBox1"));
		solo.clickOnView(solo.getView("checkBox2"));
		solo.clickOnView(solo.getView("checkBox3"));
		solo.clickOnView(solo.getView("checkBox4"));
		solo.clickOnView(solo.getView("radioButton1"));
		solo.clickOnView(solo.getView("radioButton2"));
		solo.clickOnView(solo.getView("button1"));
		
		
	}

}
