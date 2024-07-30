/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.genman.wbs.logging;

/**
 *
 * @author Admin
 */
import com.google.common.util.concurrent.MoreExecutors;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executor;

public class LoggingService {
    private static Executor executor = MoreExecutors.directExecutor();
    private static final Logger logger = new Logger(Level.INFO);
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    static final Log log = new Log();

    public static void logSevere(String message, Exception exception, LocalDateTime time) {
        setValues(message, exception, time);
        executor.execute(severeLogger);
    }

    public static void logWarning(String message, Exception exception, LocalDateTime time) {
        setValues(message, exception, time);
        executor.execute(warningLogger);
    }

    public static void logInfo(String message, LocalDateTime time) {
        setValues(message, null, time);
        executor.execute(infoLogger);
    }

    private static void setValues(String message, Exception exception, LocalDateTime time) {
        log.message = message;
        log.exception = exception;
        log.time = dateFormat.format(time);
    }

    private static Runnable severeLogger = () -> {
        log.level = Level.SEVERE;
        logger.log();
    };

    private static Runnable warningLogger = () -> {
        log.level = Level.WARNING;
        logger.log();
    };

    private static Runnable infoLogger = () -> {
        log.level = Level.INFO;
        logger.log();
    };
}
