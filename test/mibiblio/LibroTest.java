/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mibiblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 * @see Libro
 */
public class LibroTest {

    private List<Autor> autores;
    private Libro libro;

    public LibroTest() {
    }

    @Before
    public void setUp() {
        autores = new ArrayList();
        libro = new Libro("sdasdasdas", "Espronceda", autores, LocalDate.now(), "Galaxia");
        autores.add(new Autor("Pedro", "Ogando"));
        autores.add(new Autor("Artai", "Pazos"));
        autores.add(new Autor("Pedro", "Martinez"));
    }

    @After
    public void tearDown() {
        autores = null;
    }

    @Test
    public void testEsDeAutor() throws Exception {
        Autor autor = new Autor("Pedro", "Ogando");
        assertTrue(libro.esDeAutor(autor));
        autor = new Autor("Pero", "Ogando");
        assertFalse(libro.esDeAutor(autor));
    }

}
