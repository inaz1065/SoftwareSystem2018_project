package com.mendhak.gpslogger.senders;

import android.test.suitebuilder.annotation.SmallTest;
import com.mendhak.gpslogger.common.PreferenceHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SmallTest
@RunWith(MockitoJUnitRunner.class)
public class GpxReaderTest {

    @Test
    public void getDateFormatter_Test(){
        GpxReader gpxReader = new GpxReader();
        assertThat("", gpxReader.getDateFormatter().toPattern(), is("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
    }
}
