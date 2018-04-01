package com.mendhak.gpslogger.senders.ftp;

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
public class FtpJobTest {
    @Test
    public void shouldReRunOnThrowableTest(){
        FtpJob job = new FtpJob("server", 1, "username", "password", "direct", true, "pro", true, new File("gpx"), "file");
        assertThat(job.shouldReRunOnThrowable(new Throwable()), is(false));
    }

    @Test
    public void getJobTagTest(){
        FtpJob job = new FtpJob("server", 1, "username", "password", "direct", true, "pro", true, new File("gpx"), "file");

        assertThat(job.getJobTag(new File("file")), is("FTPfile"));
    }
}
