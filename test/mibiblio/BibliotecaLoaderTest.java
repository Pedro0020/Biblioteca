/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mibiblio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class BibliotecaLoaderTest {

    public BibliotecaLoaderTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetBlbliotecaRandom() {

        assertEquals(4, BibliotecaLoader.getBlbliotecaRandom(4).getNumLibros());
    }

    @Test
    public void testGetWindowsBaseLibros() {
        if (System.getProperty("os.name").equals("Windows")) {
            assertEquals(143, BibliotecaLoader.getWindowsBaseLibros().size());
        } else {
            System.err.println("La prueba testGetWindowsBaseLibros()\nsolo se ejecuta con un sistema Windows.\nAhora mismo esta usando " + System.getProperty("os.name")+"\n");
        }
    }

    @Test
    public void testGetLinuxBaseLibros() {
        if (System.getProperty("os.name").equals("Linux")) {
            assertEquals(143, BibliotecaLoader.getLinuxBaseLibros().size());
        } else {
            System.err.println("La prueba testGetLinuxBaseLibros()\nsolo se ejecuta con un sistema Linux.\nAhora mismo esta usando " + System.getProperty("os.name")+"\n");
        }
    }

    @Test
    public void testGetWindowsUsersAsAutores() {
        if (System.getProperty("os.name").equals("Windows")) {
            assertTrue(BibliotecaLoader.getWindowsUsersAsAutores().contains(new Autor(System.getProperty("user.name"), "Usuario-windows")));
        } else {
            System.err.println("La prueba testGetWindowsUsersAsAutores()\nsolo se ejecuta con un sistema Windows.\nAhora mismo esta usando " + System.getProperty("os.name")+"\n");
        }
    }

    @Test
    public void testGetLinuxUsersAsAutores() {
        if (System.getProperty("os.name").equals("Linux")) {
            assertTrue(BibliotecaLoader.getLinuxUsersAsAutores().contains(new Autor(System.getProperty("user.name"), "Usuario-linux")));
            assertFalse(BibliotecaLoader.getLinuxUsersAsAutores().contains(new Autor(System.getProperty("user.name"), "Usurio-linux")));
        } else {
            System.err.println("La prueba testGetLinuxUsersAsAutores()\nsolo se ejecuta con un sistema Linux.\nAhora mismo esta usando " + System.getProperty("os.name")+"\n");

        }

    }
}
