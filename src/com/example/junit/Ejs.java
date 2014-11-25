package com.example.junit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejs {


    public static int ejercicio1(int x, int y) {
        int ret = -1;
        if (x > 0 && x < 255 && y > 0 && y < 255) {
            if (x % 2 == 0) {
                ret = 8 - x;
            } else {
                ret = (13 + x) / 2;
            }
            if (y % 2 == 0) {
                ret += 8 - y;
            } else {
                ret += (13 + y) / 2;
            }
        }
        return ret;
    }

    public static int ejercicio2(int x, int y) {
        int temp = x;
        if (x > 0 && x < 255 && y > 0 && y < 255) {
            for (int i = 2; i <= y; i++) {
                temp = temp * i;
            }
            return temp;
        } else {
            return -1;
        }
    }

    public static int ejercicio2a(int x, int y) {
        int temp = x;
        if (x < 0 || x > 255 || y < 0 || y > 255) {
            return -1;
        }
            for (int i = 2; i <= y; i++) {
                temp = temp * i;
            }
            return temp;


    }


    public static float ejercicio3(int x, int y) {
        if (x > 0 && x < 255 && y > 0 && y < 255) {
            return (float) x / y;
        } else {
            return -1;
        }
    }

    public static String ejercicio4(String s1, String s2) {
        String ret = "";
        for (int i = 0; i < s1.length(); i++) {
            String caracter = s1.charAt(i) + "";
            if (!s2.toLowerCase().contains(caracter.toLowerCase())) {
                ret += s1.charAt(i) + "";
            }

        }
        return ret;

    }




    public static int[] ejercicio5(int[] arr)
    {
        Set<Integer> alreadyPresent = new HashSet<Integer>();
        int[] whitelist = new int[0];

        for (int nextElem : arr) {
            if (!alreadyPresent.contains(nextElem)) {
                whitelist = Arrays.copyOf(whitelist, whitelist.length + 1);
                whitelist[whitelist.length - 1] = nextElem;
                alreadyPresent.add(nextElem);
            }
        }
        return whitelist;
    }

    public static String ejercicio6(String entrada) {

        String[] palabras =entrada.split(" ");
        String salida="";

        for(int i= palabras.length-1; i>=0; i--) {
            salida += palabras[i] + " ";
        }
        return salida.trim();
    }


    public static String ejercicio7(String entrada) {

        char[] c = entrada.toCharArray();

        for(int i=0;i<c.length;i++)
        {
            if(c[i]<'a' && c[i]>'z')
                c[i]=(char)(c[i]+('a'-'A'));

        }
        return String.valueOf(c);
    }



    public static int ejercicio8(String entrada, char buscado) {
        int cuenta=0;
        boolean palabraContada=false;

        for(int i=0; i<entrada.length() ; i++){
            char a=entrada.toLowerCase().charAt(i);


            if (a==','||a==';'||a==' '||a=='.'){
            palabraContada=false;
            }
            else
            {
                if (a==buscado&&palabraContada==false){
                cuenta++;
                palabraContada=true;
            }
            }


        }
        return cuenta;
    }

    public static boolean ejercicio9(int entrada) {
        for (int i=1; i<entrada+1;i++)
        {
            int pow=i*i;

            if(entrada==pow){
                return true;
            }
            if(pow>entrada) //break if it is over entry
            {return false;
            }
        }
        return false;
    }


    public static int ejercicio10(int limiteMin, int limiteMax) {
        int actual = limiteMin;
        int sum =0;

        while (actual<=limiteMax) {

            for (int i = 1; i < actual; i++) {//comprueba si actual es perfecto
                if (actual % i == 0) {
                    sum += i;
                }
            }
            if (sum == actual)//retorna actual si si es perfecto.
            {return actual;}

            actual++;//next number
            sum =0;//reset counter
        }
        return -1;
    }


    }
