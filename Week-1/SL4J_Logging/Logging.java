package org.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {
    private static final Logger log = LoggerFactory.getLogger(Logging.class);

    public static void main(String[] args) {
        log.info("This is a info Message");
        log.warn("This is a Warning message");
        log.error("This is an Error message");
        log.debug("This is a debug message");
        log.trace("This is a trace message");
    }
}