package com.roadmap.java.readmap;

import com.roadmap.java.readmap.fundaments.Aritmetics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AritmeticsTest {

    @Test
    void sumaTest(){
        assertEquals(15,Aritmetics.sumas(10,5), "la suma debe ser 15");
    }

    @Test
    void restaTest(){
        assertEquals(5, Aritmetics.restas(10,5), "la resta debe ser 5");
    }

    @Test
    void multiplicacionTest(){
        assertEquals(50, Aritmetics.multiplicaciones(10,5), "la multiplicacion debe ser 5");
    }

    @Test
    void divicionesTest(){
        assertEquals(2, Aritmetics.diviciones(10,5), "la divicion debe ser 2");
    }

    @Test
    public void testPrintResultado() {
        String resultadoEsperado = "suma: 10\nresta: 0\nmultiplicacion: 25\ndivicion: 1";
        assertEquals(resultadoEsperado, Aritmetics.printResultado(5, 5));
    }
}
