package opgave03;

import opgave03.models.ConsoleLogger;
import opgave03.models.FileLogger;
import opgave03.models.WebServer;

public class Opgave03 {
    public static void main(String[] args) {
        WebServer server = new WebServer(new ConsoleLogger());
        server.handleRequest("Hello World");
        server.setLogger(new FileLogger("log.txt"));
        server.handleRequest("Hello World in file");
    }
}
