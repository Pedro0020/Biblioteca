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
 */
public class BibliotecaTest {

    private Biblioteca b;
    private List<Autor> autores;
    private List<Libro> libros;

    public BibliotecaTest() {
    }

    @Before
    public void setUp() {
        b = new Biblioteca();
        autores = new ArrayList();
        autores.add(new Autor("Pedro", "Ogando"));
        autores.add(new Autor("Artai", "Pazos"));
        autores.add(new Autor("Pedro", "Martinez"));

    }

    @After
    public void tearDown() {
        b = null;
        autores = null;
    }

    @Test
    public void testAddLibro() {
        assertTrue(b.addLibro(new Libro("670-900-986-099", "Espronceda", autores, LocalDate.now(), "Galaxia")));
        assertEquals(1, b.getNumLibros());
    }

    @Test
    public void testGetNumLibros() {
        b.addLibro(new Libro("670-900-986-099", "Espronceda", autores, LocalDate.now(), "Galaxia"));
        assertEquals(1, b.getNumLibros());
        b.addLibro(new Libro("670-900-986-099", "Espronceda", autores, LocalDate.now(), "Galaxia"));
        assertEquals(2, b.getNumLibros());

    }

    @Test
    public void testGetNumTitulos() {
        b.addLibro(new Libro("670-900-986-099", "Espronceda", autores, LocalDate.now(), "Galaxia"));
        assertEquals(1, b.getNumLibros());
    }

    @Test
    public void testGetLibrosPorAutor() throws Exception {
        Autor a = new Autor("Pedro", "Ogando");
        b.addLibro(new Libro("670-900-986-099", "Espronceda", autores, LocalDate.now(), "Galaxia"));
        b.addLibro(new Libro("670-900-986-99", "onceda", autores, LocalDate.now(), "Galaxia"));
        assertEquals(2, b.getLibrosPorAutor(a).size());
    }

    @Test
    public void testGetLibrosPorTitulo() {
        Autor a = new Autor("Pedro", "Ogando");
        b.addLibro(new Libro("670-900-986-099", "Espronceda", autores, LocalDate.now(), "Galaxia"));
        b.addLibro(new Libro("670-900-986-599", "onceda", autores, LocalDate.now(), "Galaxia"));
        assertEquals(1, b.getLibrosPorTitulo("Espronceda").size());
    }

}
