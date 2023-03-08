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

    }

    @Test
    public void testGetLinuxBaseLibros() {
//                assertEquals(1, BibliotecaLoader.getLinuxBaseLibros());

    }

    @Test
    public void testGetWindowsUsersAsAutores() {

    }

    @Test
    public void testGetLinuxUsersAsAutores() {
        assertTrue(BibliotecaLoader.getLinuxUsersAsAutores().contains(System.getProperties().));

    }

}
