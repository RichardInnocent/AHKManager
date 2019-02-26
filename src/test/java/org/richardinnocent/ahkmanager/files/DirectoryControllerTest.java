package org.richardinnocent.ahkmanager.files;

import org.junit.After;
import org.junit.Test;
import org.richardinnocent.ahkmanager.scripts.AHKDirectory;

import java.io.File;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

/**
 * @author Richard Innocent
 */
public class DirectoryControllerTest {

    private final DirectoryController controller = DirectoryController.getInstance();

    @After
    public void cleanUp() {
        controller.clearDirectories();
    }

    @Test
    public void testAddDirectory() {
        AHKDirectory ahkDirectory1 = mock(AHKDirectory.class);
        AHKDirectory ahkDirectory2 = mock(AHKDirectory.class);
        controller.addDirectory(ahkDirectory1);
        controller.addDirectory(ahkDirectory2);
        assertTrue(controller.getDirectories().contains(ahkDirectory1));
        assertTrue(controller.getDirectories().contains(ahkDirectory2));
        controller.removeDirectory(ahkDirectory1);
        assertFalse(controller.getDirectories().contains(ahkDirectory1));
        assertTrue(controller.getDirectories().contains(ahkDirectory2));
    }

    @Test
    public void testRemoveDirectoryAsFilePath() {
        String filePath = "C:/some/file/path";
        AHKDirectory ahkDirectory = mock(AHKDirectory.class);
        when(ahkDirectory.getFilePath()).thenReturn(filePath);

        controller.addDirectory(ahkDirectory);
        assertTrue(controller.getDirectories().contains(ahkDirectory));

        controller.removeDirectory(filePath);
        assertFalse(controller.getDirectories().contains(ahkDirectory));
    }

    @Test
    public void testRemoveDirectoryAsFile() {
        String filePath = "C:/some/file/path";
        AHKDirectory ahkDirectory = mock(AHKDirectory.class);
        when(ahkDirectory.getFilePath()).thenReturn(filePath);
        File file = mock(File.class);
        when(file.isDirectory()).thenReturn(true);
        when(file.getAbsolutePath()).thenReturn(filePath);

        controller.addDirectory(ahkDirectory);
        assertTrue(controller.getDirectories().contains(ahkDirectory));

        controller.removeDirectory(file);
        assertFalse(controller.getDirectories().contains(ahkDirectory));
    }

    @Test
    public void testClear() {
        AHKDirectory ahkDirectory1 = mock(AHKDirectory.class);
        AHKDirectory ahkDirectory2 = mock(AHKDirectory.class);
        controller.addDirectory(ahkDirectory1);
        controller.addDirectory(ahkDirectory2);
        assertEquals(2, controller.getNumberOfDirectories());
        controller.clearDirectories();
        assertEquals(0, controller.getNumberOfDirectories());
    }

}