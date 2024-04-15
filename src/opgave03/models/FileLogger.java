package opgave03.models;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public class FileLogger implements LogType {
    String fileLocation;
    public FileLogger(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Override
    public void logInfo(String message) {
        try (PrintWriter printWriter = new PrintWriter(this.fileLocation)) {
            String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][INFO] " + message;
            printWriter.println(logMessage);
        } catch (Exception e) {

        }
    }

    @Override
    public void logError(String message) {
        try (PrintWriter printWriter = new PrintWriter(this.fileLocation)) {
            String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][ERROR] " + message;
            printWriter.println(logMessage);
        } catch (Exception e) {

        }
    }
}
