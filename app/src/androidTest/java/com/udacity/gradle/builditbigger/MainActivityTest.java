package com.udacity.gradle.builditbigger;

import android.support.test.espresso.intent.rule.IntentsTestRule;

import com.eighthbit.jokesviewer.JokesViewerActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasClassName;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.AllOf.allOf;


public class MainActivityTest {

    @Rule
    public IntentsTestRule<MainActivity> mainActivityIntentsTestRule =
            new IntentsTestRule<>(MainActivity.class);

    @Test
    public void startActivity_withIntent() {
        onView(allOf(withId(R.id.joke_btn))).perform(click());
        intended(hasComponent(hasClassName(JokesViewerActivity.class.getName())));
        intended(hasExtra(equalTo("joke"), notNullValue()));
        onView(allOf(withId(R.id.joke_tv))).check(matches(not(withText(""))));
    }
}