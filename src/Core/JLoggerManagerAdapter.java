package Core;

import JLogger.JLoggerManager;

//adaptasyon sınıfı
public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
    }
}
