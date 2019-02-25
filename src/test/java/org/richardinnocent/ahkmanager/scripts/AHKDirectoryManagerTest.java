package org.richardinnocent.ahkmanager.scripts;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author RichardInnocent
 */
public class AHKDirectoryManagerTest {

  /**
   * Ensures there are no exceptions when saving the manager
   * @throws IOException Should not be thrown for this test
   */
  @Test
  public void testSaveAndLoad() throws IOException {
    AHKDirectoryManager manager = AHKDirectoryManager.getInstance();
    PipedInputStream pipeInput = new PipedInputStream();
    BufferedOutputStream out = new BufferedOutputStream(new PipedOutputStream(pipeInput));
    manager.save(out);
  }

}
