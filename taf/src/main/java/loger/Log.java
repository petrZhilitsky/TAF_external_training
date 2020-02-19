package loger;

import org.apache.log4j.Logger;

public class Log {
    public static Logger logger = Logger.getLogger("Logger");

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void error(String message) {
        logger.error(message);
    }
}
