package com.mendhak.gpslogger.loggers.opengts;

import android.test.suitebuilder.annotation.SmallTest;

import com.mendhak.gpslogger.common.SerializableLocation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class OpenGtsUdpJobTest {
    /**
     * Purpose : make constructor test
     * Input : OpenGtsUdpJob(String, int, String, String, String, String, SerializableLocation[])
     * Expected :
     */
    @Test
    public void makeConstructorTest() {
        String serverTest = "";
        int portTest = 0;
        String accountNameTest = "";
        String pathTest = "";
        String deviceIdTest = "";
        String communication = "";
        SerializableLocation[] locations = null;
        OpenGtsUdpJob testOpenGtsUdpJob =
                new OpenGtsUdpJob(serverTest, portTest, accountNameTest, pathTest, deviceIdTest, communication, locations);
    }
    /**
     * Purpose : check onAdded() function
     * Input : onAdded
     * Expected :
     */
    @Test
    public void onAddedTest() {
        String serverTest = "";
        int portTest = 0;
        String accountNameTest = "";
        String pathTest = "";
        String deviceIdTest = "";
        String communication = "";
        SerializableLocation[] locations = null;
        OpenGtsUdpJob testOpenGtsUdpJob =
                new OpenGtsUdpJob(serverTest, portTest, accountNameTest, pathTest, deviceIdTest, communication, locations);
        testOpenGtsUdpJob.onAdded();
    }

    /**
     * Purpose : check onRun() function
     * Input : onRun()
     * Expected :
     */
    @Test
    public void onRunTest() throws Throwable {
        String serverTest = "";
        int portTest = 0;
        String accountNameTest = "";
        String pathTest = "";
        String deviceIdTest = "";
        String communication = "";
        SerializableLocation[] locations = null;
        OpenGtsUdpJob testOpenGtsUdpJob =
                new OpenGtsUdpJob(serverTest, portTest, accountNameTest, pathTest, deviceIdTest, communication, locations);
        testOpenGtsUdpJob.onRun();
    }

    /**
     * Purpose : check onCancel() function
     * Input : onCancel
     * Expected :
     */
    @Test
    public void onCancelTest() {
        String serverTest = "";
        int portTest = 0;
        String accountNameTest = "";
        String pathTest = "";
        String deviceIdTest = "";
        String communication = "";
        SerializableLocation[] locations = null;
        OpenGtsUdpJob testOpenGtsUdpJob =
                new OpenGtsUdpJob(serverTest, portTest, accountNameTest, pathTest, deviceIdTest, communication, locations);
        testOpenGtsUdpJob.onCancel();
    }

    /**
     * Purpose : check shouldReRunOnThrowable() function
     * Input : shouldReRunOnThrowable(Throwable)
     * Expected : return false
     */
    @Test
    public void shouldReRunOnThrowableTest() {
        String serverTest = "";
        int portTest = 0;
        String accountNameTest = "";
        String pathTest = "";
        String deviceIdTest = "";
        String communication = "";
        SerializableLocation[] locations = null;
        OpenGtsUdpJob testOpenGtsUdpJob =
                new OpenGtsUdpJob(serverTest, portTest, accountNameTest, pathTest, deviceIdTest, communication, locations);
        Throwable throwable = new Throwable();
        assertEquals(false, testOpenGtsUdpJob.shouldReRunOnThrowable(throwable));
    }

    /**
     * Purpose : check sendRaw() function
     * Input : sendRAW(String, String, SerializableLocation[])
     * Expected :
     */
    @Test
    public void sendRAWTest() throws Exception {
        String serverTest = "";
        int portTest = 0;
        String accountNameTest = "";
        String pathTest = "";
        String deviceIdTest = "";
        String communication = "";
        SerializableLocation[] locations = null;
        OpenGtsUdpJob testOpenGtsUdpJob =
                new OpenGtsUdpJob(serverTest, portTest, accountNameTest, pathTest, deviceIdTest, communication, locations);
        String testID = "";
        String testAccountName = "";
        SerializableLocation[] testLocations = null;
        testOpenGtsUdpJob.sendRAW(testID, testAccountName, testLocations);
    }
}