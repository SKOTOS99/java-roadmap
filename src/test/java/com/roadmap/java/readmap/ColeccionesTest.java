package com.roadmap.java.readmap;

import com.roadmap.java.readmap.fundaments.Colecciones;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColeccionesTest {

   public static int[] numeros;
    @BeforeAll
    public static void setUpBeforeClass(){
         numeros =new int[] {10, 23, 5, 8, 19, 2};

    }

    @Test
    public void testColecciones(){
        assertEquals(67, Colecciones.calculaSuma(numeros), "el resultado debe ser 67");
    }

    @Test
    void testCalculaPromedio(){
        assertEquals(11.17, Colecciones.calculaMedia(numeros) ,0.01, "el resultado debe ser 11.17");

    }

    @Test
    void testCalculaPares(){
        int[] pares = {10,8,2};
        assertArrayEquals(pares, Colecciones.filtraNumerosPares(numeros));
    }

    @Test
    void calculaNumeros(){
        int par = Colecciones.filtraNumerosPares(numeros)[0];
        assertEquals(0, par%2, "el resultado debe ser 0");
    }

    @Test
    void testOrdenaNumeros(){
        Integer[] desc = {23, 19, 10, 8, 5, 2};
        assertArrayEquals(desc, Colecciones.ordeenaDesc(numeros));
    }
}
