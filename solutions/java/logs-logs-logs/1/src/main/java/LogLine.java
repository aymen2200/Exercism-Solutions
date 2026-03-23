public class LogLine {
    private final String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = logLine.substring(logLine.indexOf('[') + 1,logLine.indexOf(']'));
        return switch(level) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        
        String level = logLine.substring(logLine.indexOf('[') + 1,logLine.indexOf(']'));
        String message = logLine.substring(logLine.indexOf(':') + 2).trim();
        return switch(level) {
            case "TRC" -> "1:" + message;
            case "DBG" -> "2:" + message;
            case "INF" -> "4:" + message;
            case "WRN" -> "5:" + message;
            case "ERR" -> "6:" + message;
            case "FTL" -> "42:" + message;
            default -> "0:" + message;
        };
    }
}
