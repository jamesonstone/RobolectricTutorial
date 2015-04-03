package com.iron.jamesonstone.robolectrictutorial;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;


public class MainActivityTestUnitActivity extends ActivityUnitTestCase<MainActivity> {

    private MainActivity activity;

    public MainActivityTestUnitActivity() {
        super(MainActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
//        Intent intent = new Intent(getInstrumentation().getTargetContext(),
//                MainActivity.class);
//        startActivity(intent, null, null);
//        activity = getActivity();
    }

    public void testLayout() {
        Intent intent = new Intent(getInstrumentation().getTargetContext(),
                MainActivity.class);
        startActivity(intent, null, null);
        activity = getActivity();
        int buttonId = R.id.button;
        ActivityUnitTestCase.assertNotNull(activity.findViewById(buttonId));
        Button view = (Button) activity.findViewById(buttonId);
        ActivityUnitTestCase.assertEquals("Incorrect label of the button", "Say Hi!", view.getText());
    }
//
//    public void testOnCreateOptionsMenu() throws Exception {
//
//    }
//
//    public void testOnOptionsItemSelected() throws Exception {
//
//    }
//
//    public void testOnButtonPressListener() throws Exception {
//
//    }
}