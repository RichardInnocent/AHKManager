package org.richardinnocent.ahkmanager.files;

import java.io.InputStream;

public final class AppConfig {

  private double initialWidth = 1_000d;
  private double initialHeight = 800d;

  private AppConfig() {}

  public static AppConfig initialise(InputStream propertyStream) {
    // TODO
    return new AppConfig();
  }

  public double getInitialWidth() {
    return initialWidth;
  }

  public double getInitialHeight() {
    return initialHeight;
  }

}
