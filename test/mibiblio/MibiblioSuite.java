/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package mibiblio;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author alumno
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({mibiblio.BibliotecaTest.class, mibiblio.LibroTest.class, mibiblio.BibliotecaLoaderTest.class})
public class MibiblioSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
