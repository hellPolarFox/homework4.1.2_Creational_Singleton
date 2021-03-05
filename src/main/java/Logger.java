import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    protected int counter = 1;
    private static Logger instance = null;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String msg) {
        System.out.println("["
                + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss"))
                + " (" + counter++ + ")] "
                + msg);
    }
}
