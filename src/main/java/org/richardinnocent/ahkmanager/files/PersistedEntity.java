package org.richardinnocent.ahkmanager.files;

import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.richardinnocent.ahkmanager.flow.Execution;

public class PersistedEntity implements Persisted {

  private static final Logger LOGGER = LogManager.getLogger(PersistedEntity.class);

  @Override
  public void save(OutputStream out) throws IOException {
    ObjectOutputStream objectOut = null;
    try {
      objectOut = new ObjectOutputStream(out);
      objectOut.writeObject(this);
    } catch (IOException e) {
      throw e;
    } finally {
      closeStream(objectOut);
      closeStream(out);
    }
  }

  private void closeStream(Closeable stream) {
    try {
      if (stream != null)
        stream.close();
    } catch (IOException e) {
      Execution.warn(LOGGER, "Could not close stream", e);
    }
  }
}
