package com.mendhak.gpslogger.senders.googledrive;

import android.test.suitebuilder.annotation.SmallTest;
import com.mendhak.gpslogger.common.PreferenceHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.File;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class GoogleDriveJobTest {
    @Test
    public void shouldReRunOnThrowableTest(){
        GoogleDriveJob job = new GoogleDriveJob(new File("gpx"), "foldername");
        assertThat(job.shouldReRunOnThrowable(new Throwable()), is(false));
    }

    @Test
    public void getJobTagTest(){
        GoogleDriveJob job = new GoogleDriveJob(new File("gpx"), "foldername");

        assertThat(job.getJobTag(new File("file")), is("GOOGLEDRIVEfile"));
    }
}
