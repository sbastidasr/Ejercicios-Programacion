package com.example.junit;
import static org.junit.Assert.*;
import org.junit.Before;

public class EjsTest {

    private Ejs ejs;

    @Before
    public void setUp() throws Exception{
        ejs =new Ejs();
    }

    @org.junit.Test
    public void testEjercicio1() throws Exception {
        assertEquals(-1, ejs.ejercicio1(-1, 3));  //negativo -1
        assertEquals(-1, ejs.ejercicio1(1, 256));  //mayor a 255
        assertEquals(15, ejs.ejercicio1(1, 3));
        assertEquals(11, ejs.ejercicio1(6, 5));
        assertEquals(9, ejs.ejercicio1(9, 10));
    }

    @org.junit.Test
    public void testEjercicio2() throws Exception {
        assertEquals(-1, ejs.ejercicio2a(-1, 4));  //negativo -1
        assertEquals(-1, ejs.ejercicio2a(-1, 256)); //mayor a 255
        assertEquals(3, ejs.ejercicio2a(3, 1));
        assertEquals(6, ejs.ejercicio2a(3, 2));
        assertEquals(72, ejs.ejercicio2a(3, 4));
        assertEquals(48, ejs.ejercicio2a(2, 4));
        assertEquals(4, ejs.ejercicio2a(2, 2));
        //2a mio
        //2 lore
    }

    @org.junit.Test
    public void testEjercicio3() throws Exception {
        assertEquals(20.0, ejs.ejercicio3(60, 3),0.0f);
    }

    @org.junit.Test
    public void testEjercicio4() throws Exception {
        assertEquals("DvsuCodJsjustgt", ejs.ejercicio4("DevsuCodeJam is just great!", "I am here! :)"));
    }

    @org.junit.Test
    public void testEjercicio5() throws Exception {
        int[] entrada = {-3, -2, 0, 0, 5, 7, 9, 11, 11, 25};
        int[] salida =   {-3, -2, 0, 5, 7, 9, 11, 25};
        assertArrayEquals(salida, ejs.ejercicio5(entrada));
    }

    @org.junit.Test
    public void testEjercicio6() throws Exception {
        assertEquals("test a is this",ejs.ejercicio6("this is a test"));
        assertEquals("",ejs.ejercicio6(""));
        assertEquals("hola",ejs.ejercicio6("hola"));
    }

    /*7. Lowercase
Given a string which contain letters (uppercase and lowercase), numbers, and special
characters, return the same string in all lowercase.
For example, if the function receives:
“Ñañito, QUÉ bien! THIS is a sample text, Lorem Ipsum, 2 Be Converted.”
The function should return:
“ñañito, qué bien! this is a sample text, lorem ipsum, 2 be converted.”
The function should consider converting: All characters from A-Z, Á,É,Í,Ó,Ú and Ñ. Other
characters will remain the same.
*/
    @org.junit.Test
    public void testEjercicio7() throws Exception {
        String entrada = "Ñañito, QUÉ bien! THIS is a sample text, Lorem Ipsum, 2 Be Converted.";
        String salida = "ñañito, qué bien! this is a sample text, lorem ipsum, 2 be converted.";
        assertEquals(salida, ejs.ejercicio7(salida) );
    }

    /*8. A-Words
Given a string, find the number of words that has at least one “a” character (uppercase or
lowercase). Do not take into account character variations like á, à, etc... only the simple “a”
and “A” counts.
The words are always separated by a space, a comma, a semicolon or a dot.
For example:
If the function receives: “this is a sample text, it has a lot of analysis.” The function should
return 5, since five words has “a” characters. (a, sample, has, a, analysis).
The function will receive a string and return an integer.
Limitations: Do not use the split() function, or similar.*/
    @org.junit.Test
    public void testEjercicio8() throws Exception {
        String entrada = "this is a sample text, it has a lot of analysis.";
        assertEquals(5, ejs.ejercicio8(entrada,'a') );
    }

/*
*
* 9. The power of two
Given a positive integer number determine if it’s the power of two of another integer.
Don’t start coding, read the limitations.
For example:
If the function receives 25, it should return TRUE, because 5^2 = 25
If the function receives 1, it should return TRUE, because 1^2 = 1
If the function receives 16, it should return TRUE, because 4^2 = 16
If the function receives 14, it should return FALSE.
Limitation: You CAN’T use functions of square roots (sqrt() or similar), potentiation (pow()
or similar). ONLY the basic arithmetic operations (sum, substraction, multiplication, division),
and any logic operations are allowed.
The function receives a positive integer greater than 0, and should return a boolean value.
*/

    @org.junit.Test
    public void testEjercicio9() throws Exception {
        assertEquals(true, ejs.ejercicio9(25) );
        assertEquals(true, ejs.ejercicio9(1) );
        assertEquals(true, ejs.ejercicio9(16) );
        assertEquals(false, ejs.ejercicio9(14) );
    }
/*10. Perfect numbers
A perfect number is a positive integer that is equal to the sum of its proper divisors. For
example, 6 is a perfect number because 6=1+2+3.
Create a function that receives two values X and Y and return the smaller perfect number
found, which is greater or equal than X and lower or equal than Y. If no perfect number
found, it should return -1.
For example, if the function receives X=5, Y=7, it should return 6, because 6 is the smaller
perfect number between 5 and 7.
The function will receive two integers and return one integer.*/

    @org.junit.Test
    public void testEjercicio10() throws Exception {

        assertEquals(6, ejs.ejercicio10(5,7) );
        assertEquals(496, ejs.ejercicio10(400, 500) );
        assertEquals(8128, ejs.ejercicio10(5000,9000) );
        assertEquals(-1, ejs.ejercicio10(14,21) );
    }

    

}