package espresso;

import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;

import com.iron.jamesonstone.robolectrictutorial.MainActivity;
import com.iron.jamesonstone.robolectrictutorial.R;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
* Created by jamesonstone on 4/2/15.
*/
public class MainActivityTestEspresso  extends ActivityInstrumentationTestCase2<MainActivity> {

    public static final String TYPE_STRING = "Hello Jameson";

    public MainActivityTestEspresso() { super(MainActivity.class); }

    protected void setUp() throws Exception {
        super.setUp();
        //Activity's not actually created until this call
        getActivity();
    }

    public void testInsertEditText() {
        onView(ViewMatchers.withId(R.id.editText)).perform(typeText(TYPE_STRING));

    }



}
