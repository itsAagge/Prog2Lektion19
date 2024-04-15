package opgave03.models;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public class FileLogger implements LogType {
    @Override
    public void logInfo(String message) {
        String fileLocation = "log.txt";
        try (PrintWriter printWriter = new PrintWriter(fileLocation)) {
            String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][INFO] " + message;
            printWriter.println(logMessage);
        } catch (Exception e) {

        }
    }

    @Override
    public void logError(String message) {
        String fileLocation = "log.txt";
        try (PrintWriter printWriter = new PrintWriter(fileLocation)) {
            String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][ERROR] " + message;
            printWriter.println(logMessage);
        } catch (Exception e) {

        }
    }
}
