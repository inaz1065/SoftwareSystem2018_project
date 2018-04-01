package com.mendhak.gpslogger.loggers.opengts;

import android.test.suitebuilder.annotation.SmallTest;
import android.content.Context;
import android.location.Location;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;


@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class OpenGTSLoggerTest {
    /**
     * Purpose : make constructor test
     * Input : OpenGTSLogger(Context)
     * Expected :
     */
    @Test
    public void makeConstructorTest() {
        Context context = null;
        OpenGTSLogger testOpenGTSLogger = new OpenGTSLogger(context);
    }
    /**
     * Purpose : check write() function
     * Input : write(Location)
     * Expected :
     */
    @Test
    public void writeTest() throws Exception {
        Context context = null;
        OpenGTSLogger testOpenGTSLogger = new OpenGTSLogger(context);
        Location loc = null;
        testOpenGTSLogger.write(loc);
    }
    /**
     * Purpose : check annotate() function
     * Input : annotate()
     * Expected :
     */
    @Test
    public void annotateTest() throws Exception {
        Context context = null;
        OpenGTSLogger testOpenGTSLogger = new OpenGTSLogger(context);
        String testStr = "";
        Location loc = null;
        testOpenGTSLogger.annotate(testStr, null);
    }
    /**
     * Purpose : check getName() function
     * Input : getName()
     * Expected :
     */
    @Test
    public void getNameTest() {
        Context context = null;
        OpenGTSLogger testOpenGTSLogger = new OpenGTSLogger(context);
        assertEquals("OpenGTS", testOpenGTSLogger.getName());
    }
}