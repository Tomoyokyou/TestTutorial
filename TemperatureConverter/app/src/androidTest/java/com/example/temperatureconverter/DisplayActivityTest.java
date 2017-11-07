package com.example.temperatureconverter;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by AhPan on 11/6/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class DisplayActivityTest {
    @Rule
    public ActivityTestRule<DisplayActivity> rule  = new  ActivityTestRule<DisplayActivity>(DisplayActivity.class)
    {
        @Override
        protected Intent getActivityIntent() {
            InstrumentationRegistry.getTargetContext();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.putExtra("Celsius", "100.0");
            intent.putExtra("Fahrenheit", "212.0");
            return intent;
        }
    };

    @Test
    public void ensureIntentDataIsDisplayedCorrectly() throws Exception {
        DisplayActivity activity = rule.getActivity();

        View viewById = activity.findViewById(R.id.display);

        assertThat(viewById,notNullValue());
        assertThat(viewById, instanceOf(TextView.class));
        TextView textView = (TextView) viewById;
        assertEquals(textView.getText().toString(), "212.0F is 100.0C");
    }




}
