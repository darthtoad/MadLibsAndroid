package com.example.samuelgespass.madlibs;

import android.support.test.espresso.core.deps.guava.base.Strings;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.editText)).perform(typeText("Portland"))
                .check(matches(withText("Portland")));
        onView(withId(R.id.editText0)).perform(typeText("Peed"))
                .check(matches(withText("Peed")));
        onView(withId(R.id.editText1)).perform(typeText("Bunnies"))
                .check(matches(withText("Bunnies")));
        onView(withId(R.id.editText2)).perform(typeText("Planet"))
                .check(matches(withText("Planet")));
    }

    @Test
    public void wordsSentToMadLibActivity() {
        String word = "Portland";
        String word0 = "Peed";
        String word1 = "Bunnies";
        String word2 = "Planet";
        onView(withId(R.id.editText)).perform(typeText(word));
        onView(withId(R.id.editText0)).perform(typeText(word0));
        onView(withId(R.id.editText1)).perform(typeText(word1));
        onView(withId(R.id.editText2)).perform(typeText(word2));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.part1)).check(matches
                (withText("One day, I was walking down the street when I saw a " + word)));
        onView(withId(R.id.part2)).check(matches
                (withText("He told me that I had to " + word0)));
        onView(withId(R.id.part3)).check(matches
                (withText("After I completed this task, he gave me a million " + word1)));
        onView(withId(R.id.part4)).check(matches
                (withText("I thanked him, and he walked off into the " + word2)));

    }

}
