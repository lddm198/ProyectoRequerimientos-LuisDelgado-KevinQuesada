/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Usuario
 */
public class GeneradorContrasena {
    
    private static final String CHAR_MINUS = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_MAYUS = CHAR_MINUS.toUpperCase();
    private static final String DIGITOS = "0123456789";
    private static final String PUNTUACIONES = "!@#&()–[{}]:;',?/*";
    private static final String SIMBOLOS = "~$^+=<>";
    private static final String ESPECIALES = PUNTUACIONES + SIMBOLOS;
    private static final int LONGITUD = 10;
    
    private static final String PERMITIDOS = CHAR_MINUS + CHAR_MAYUS + DIGITOS + ESPECIALES;
    
     private static SecureRandom aleatorio = new SecureRandom();
     
     public static void main(String[] args) {
        generarContrasenaSegura();
    }
     
      public static String generarContrasenaSegura() {

        StringBuilder resultado = new StringBuilder(LONGITUD);

        // por lo menos 1 minuscula
        String strMinus = generarStringAleatorio(CHAR_MINUS, 1);
        System.out.format("%-20s: %s%n", "Minúscula", strMinus);
        resultado.append(strMinus);

        // por lo menos 1 mayuscula
        String strMayus = generarStringAleatorio(CHAR_MAYUS, 1);
        System.out.format("%-20s: %s%n", "Mayúscula", strMayus);
        resultado.append(strMayus);

        // al menos 1 digito
        String strDigito = generarStringAleatorio(DIGITOS, 1);
        System.out.format("%-20s: %s%n", "Dígito", strDigito);
        resultado.append(strDigito);

        // popor lo menos 1 especial
        String strSpecial = generarStringAleatorio(ESPECIALES, 1);
        System.out.format("%-20s: %s%n", "Especial", strSpecial);
        resultado.append(strSpecial);

        // se hace aleatorio lo que queda
        String strOtros = generarStringAleatorio(PERMITIDOS, LONGITUD - 4);
        System.out.format("%-20s: %s%n", "Otros", strOtros);
        resultado.append(strOtros);

        String contrasena = resultado.toString();
        // se combinan
        System.out.format("%-20s: %s%n", "Contraseña", contrasena);
        // se mezclan otra vez
        System.out.format("%-20s: %s%n", "Contraseña Final", mezclarString(contrasena));
        System.out.format("%-20s: %s%n%n", "Longitud", contrasena.length());

        return contrasena;
    }

    // generar un char[] alreatorio, segun el `input`
    private static String generarStringAleatorio(String input, int tamano) {

        if (input == null || input.length() <= 0)
            throw new IllegalArgumentException("Invalid input.");
        if (tamano < 1) throw new IllegalArgumentException("Invalid size.");

        StringBuilder result = new StringBuilder(tamano);
        for (int i = 0; i < tamano; i++) {
            // orden aleatorio
            int index = aleatorio.nextInt(input.length());
            result.append(input.charAt(index));
        }
        return result.toString();
    }

    // hacerla aun mas aleatoria
    public static String mezclarString(String input) {
        List<String> result = Arrays.asList(input.split(""));
        Collections.shuffle(result);
        // java 8
        return result.stream().collect(Collectors.joining());
    }
    
}
