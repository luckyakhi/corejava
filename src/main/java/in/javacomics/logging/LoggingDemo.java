package in.javacomics.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class LoggingDemo {
    private static final Logger logger= LoggerFactory.getLogger(LoggingDemo.class);
    public static void main(String[] args) {
        logger.info("Testing root logger");
    }
}
