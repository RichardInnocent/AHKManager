package org.richardinnocent.ahkmanager.flow;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.richardinnocent.ahkmanager.gui.Messenger;

public class Execution {

  public static void log(Logger logger, Level level, String message) {
    logger.log(level, message);
  }

  public static void debug(Logger logger, String message) {
    logger.debug(message);
  }

  public static void info(Logger logger, String message) {
    logger.info(message);
  }

  public static void warn(Logger logger, String message) {
    logger.warn(message);
    Messenger.showWarning(message);
  }

  public static void warn(Logger logger, String message, Throwable e) {
    logger.warn(message, e);
    Messenger.showWarning(message);
  }

  public static void error(Logger logger, String message) {
    logger.error(message);
    Messenger.showError(message);
  }

  public static void error(Logger logger, String message, Throwable e) {
    logger.error(message, e);
    Messenger.showError(message, e);
  }

}
