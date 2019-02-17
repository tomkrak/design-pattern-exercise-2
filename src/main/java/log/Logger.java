package log;

public class Logger {
    public void log(String log) {
        System.out.println(log);
    }
    public static Logger getInstance()  {
        if (instance == null) {
            return new Loger();
            }
    } return instance;

}
