package com.example.samuelgespass.madlibs;

import android.os.Build;
import android.widget.ListView;
import android.widget.TextView;

import junit.framework.Assert;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.M)



/**
 * Created by Guest on 3/13/18.
 */

public class MadLibActivityTest {
    private MadLibActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MadLibActivity.class);
    }

    @Test
    public void madLibsInstantiates() {
        TextView part1 = (TextView) activity.findViewById(R.id.part1);
        assertNotNull(part1);
    }
}
