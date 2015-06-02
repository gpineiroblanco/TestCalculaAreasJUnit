/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiestest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oquintansocampo
 */
public class ControladorTest {

    public ControladorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcC method, of class Controlador.
     */
    @Test
    public void testCalcC() {
        System.out.println("calcC");
        Cuadrado c = new Cuadrado(5, 0);
        Controlador instance = new Controlador();
        float expResult = 25.0F;
        float result = instance.calcC(c);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calcR method, of class Controlador.
     */
    @Test
    public void testCalcR() {
        System.out.println("calcR");
        Rectangulo r = new Rectangulo(10, 5, 0);
        Controlador instance = new Controlador();
        float expResult = 50.0F;
        float result = instance.calcR(r);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calcT method, of class Controlador.
     */
    @Test
    public void testCalcT() {
        System.out.println("calcT");
        Triangulo t = new Triangulo(2, 5, 0);
        Controlador instance = new Controlador();
        float expResult = 5.0F;
        float result = instance.calcT(t);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calcCir method, of class Controlador.
     */
    @Test
    public void testCalcCir() {
        System.out.println("calcCir");
        Circulo ci = new Circulo(1, 0);
        Controlador instance = new Controlador();
        float expResult = 3.14F;
        float result = instance.calcCir(ci);
        assertEquals(expResult, result, 0.0);

    }

}
