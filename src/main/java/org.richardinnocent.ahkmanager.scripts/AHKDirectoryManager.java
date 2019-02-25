package org.richardinnocent.ahkmanager.scripts;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.richardinnocent.ahkmanager.files.PersistedEntity;

public final class AHKDirectoryManager extends PersistedEntity {

  private static AHKDirectoryManager manager;

  private final Set<AHKDirectory> directories = new HashSet<>();

  private AHKDirectoryManager() {}

  public static AHKDirectoryManager getInstance() {
    if (manager == null)
      manager = new AHKDirectoryManager();
    return manager;
  }

  public boolean addDirectory(AHKDirectory directory) {
    return manager.addDirectory(directory);
  }

  public List<AHKDirectory> getDirectories() {
    return manager.getDirectories();
  }

}
