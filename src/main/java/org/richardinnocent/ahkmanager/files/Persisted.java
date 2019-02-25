package org.richardinnocent.ahkmanager.files;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

public interface Persisted extends Serializable {

  /**
   * Saves the entity to the provided output stream.
   * @param out The output stream to save the entity to.
   * @throws IOException Thrown if the entity could not be saved.
   */
  void save(OutputStream out) throws IOException;

}
