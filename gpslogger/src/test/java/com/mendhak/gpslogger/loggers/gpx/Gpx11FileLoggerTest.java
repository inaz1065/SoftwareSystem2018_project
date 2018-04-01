package com.mendhak.gpslogger.loggers.gpx;

import android.test.suitebuilder.annotation.SmallTest;

import com.mendhak.gpslogger.BuildConfig;
import com.mendhak.gpslogger.common.Strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class Gpx11FileLoggerTest {
    @Test
    /**
     * Purpose : check getWriteHandler() function
     * Input : getWriteHandler()
     * Expected : Gpx10WriteHandler(null, null, null, true);
     * */
    public void getWriteHandler(){
        Gpx10FileLogger gpx11FileLogger = new Gpx11FileLogger(null, true);
        Runnable  gpx11WriteHandler = gpx11FileLogger.getWriteHandler(null, null, null, true);
        assertNotNull(gpx11WriteHandler);
    }

}