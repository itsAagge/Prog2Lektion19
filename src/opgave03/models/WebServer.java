package opgave03.models;

public class WebServer {
    private LogType logger;

    public WebServer(LogType logger) {
        this.logger = logger;
    }

    public void handleRequest(String request) {
        if (request.isEmpty()) {
            logger.logError("Request is empty");
            return;
        }
        logger.logInfo("Handling request: " + request);
    }

    public void setLogger(LogType logger) {
        this.logger = logger;
    }
}
