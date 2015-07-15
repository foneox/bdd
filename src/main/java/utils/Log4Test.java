package utils;

import org.apache.log4j.Logger;

public class Log4Test {

    private final Logger mLog;

    public Log4Test(String name) {
        mLog =  Logger.getLogger(name);
    }

    // ****************** Default message content ********************
    private static final String INFO_LOG = "INFO: \"%s\"";
    private static final String ERROR_LOG = "\"%s\"";

    public String error (String message)
    {
        mLog.error(String.format(ERROR_LOG, message));
        return String.format(ERROR_LOG, message);
    }

    public String info(String message)
    {
        mLog.info(message);
        return String.format(INFO_LOG, message);
    }
}

