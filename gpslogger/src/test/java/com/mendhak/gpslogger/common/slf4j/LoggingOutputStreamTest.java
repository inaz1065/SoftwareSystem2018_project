package com.mendhak.gpslogger.common.slf4j;

import com.mendhak.gpslogger.senders.ftp.FtpJob;

import org.junit.Test;

import java.util.logging.Logger;

/**
 * Created by Ji Hoon on 2018-04-01.
 */

public class LoggingOutputStreamTest {
    private LoggingOutputStream logging;
    @Test
    public void testConstructor() {
        Logger log = (Logger) Logs.of(FtpJob.class);
//        Logger logger = new Logger(Logs.of(log);
//        logging = new LoggingOutputStream();
    }
}
