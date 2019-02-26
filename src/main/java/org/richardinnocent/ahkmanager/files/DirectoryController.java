package org.richardinnocent.ahkmanager.files;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.richardinnocent.ahkmanager.flow.Execution;
import org.richardinnocent.ahkmanager.scripts.AHKDirectory;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/**
 * @author Richard Innocent
 */
public class DirectoryController {

    private static final Logger LOGGER = LogManager.getLogger(DirectoryController.class);
    private static DirectoryController instance;

    private final Set<AHKDirectory> directories = new HashSet<>();

    public static DirectoryController getInstance() {
        if (instance == null)
            instance = new DirectoryController();
        return instance;
    }

    public void addDirectory(String path) {
        addDirectory(new File(path));
    }

    public void addDirectory(File file) throws SecurityException, IllegalArgumentException {
        addDirectory(new AHKDirectory(file));
    }

    public void addDirectory(AHKDirectory directory) throws SecurityException, IllegalArgumentException {
        directories.add(directory);
    }

    public void removeDirectory(String path) {
        Execution.debug(LOGGER, "Attempting to remove directory at " + path);
        removeDirectoryIf(ahkDirectory -> ahkDirectory.getFilePath().equals(path));
    }

    public void removeDirectory(File file) {
        if (file == null)
            return;
        Execution.debug(LOGGER, "Attempting to remove directory at " + file.getAbsolutePath());
        removeDirectoryIf(ahkDirectory -> ahkDirectory.getFilePath().equals(file.getAbsolutePath()));
    }

    public void removeDirectory(AHKDirectory directory) {
        Execution.debug(LOGGER, "Attempting to remove directory at " + directory);
        removeDirectoryIf(ahkDirectory -> ahkDirectory.equals(directory));
    }

    private void removeDirectoryIf(Predicate<AHKDirectory> condition) {
        Iterator<AHKDirectory> iterator = directories.iterator();
        while (iterator.hasNext()) {
            AHKDirectory directory = iterator.next();
            if (condition.test(directory)) {
                iterator.remove();
                Execution.info(LOGGER, "Removed directory " + directory);
                return;
            }
        }
        Execution.info(LOGGER, "Directory not found in DirectoryController");
    }

    public void clearDirectories() {
        Execution.info(LOGGER, "Clearing directories from controller");
        directories.clear();
    }

    public Set<AHKDirectory> getDirectories() {
        return new HashSet<>(directories);
    }

    public int getNumberOfDirectories() {
        return directories.size();
    }
}
