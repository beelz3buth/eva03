package com.iplacex.JunitTest;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import entidad.Asignatura;
import entidad.Nota;

public class AsignaturaTest {

	public AsignaturaTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	@AfterClass
	public static void tearDownClass() {
	}
	@Before
	public void setUp() {
	}
	@After
	public void tearDown() {
	}
	
	@Test
	public void testPromedio() {
		System.out.println("Promedio");
		try {
			Asignatura instance = new Asignatura("Java", 2);
			instance.getNotas().add(new Nota(4, 0.2));
			instance.getNotas().add(new Nota(6, 0.2));
			double resultado = 5;
			assertEquals(instance.promedio(), resultado, 0);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testAvance() {
		System.out.println("Avance");
		try {
			Asignatura instance = new Asignatura("Java", 2);
			instance.getNotas().add(new Nota(4, 0.2));
			instance.getNotas().add(new Nota(6, 0.2));
			double resultado = 0.4;
			assertEquals(instance.avance(), resultado, 0);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}

}
