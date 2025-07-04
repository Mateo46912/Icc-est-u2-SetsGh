package Controllers;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(tieneDuplicados(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 45 }));
        System.out.println();
        System.out.println("Ejercicio 2");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));
        System.out.println();
        System.out.println("Ejercicio 3");

        String texto = "\"\"\"\n" + //
                "La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?\n"
                + //
                "Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.\n"
                + //
                "En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.\"\"\";";
        System.out.println("El texto tiene: " + contarPalabrasUnicas(texto) + " palabras");
        System.out.println();
        System.out.println("Ejercicio 4");
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        compararTextos(texto1, texto2);
        System.out.println();
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> comprobar = new TreeSet<>();
        for (int i = 0; i < numeros.length; i++) {
            comprobar.add(numeros[i]);
        }
        if (numeros.length == comprobar.size()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean esIsograma(String palabra) {

        Set<Character> isograma = new HashSet<>();
        for (int i = 0; i < palabra.length(); i++) {
            Character c = palabra.charAt(i);
            if (!isograma.add(c)) {
                return false;
            }
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        int contador = 0;
        String[] palabras = frase.split(" ");

        Set<String> unicas = new HashSet<>();
        for (String palabra : palabras) {
            if (unicas.add(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    public Set<String> contarPalabrasUnicasSet(String frase) {
        String[] palabras = frase.split(" ");

        Set<String> unicas = new HashSet<>();
        for (String palabra : palabras) {
            if (unicas.add(palabra)) {
            }
        }
        return unicas;
    }

    public void compararTextos(String texto1, String texto2) {

        Set<String> palabras1 = contarPalabrasUnicasSet(texto1);
        Set<String> palabras2 = contarPalabrasUnicasSet(texto2);

        Set<String> comunes = new HashSet<>(palabras1);
        comunes.retainAll(palabras2);

        Set<String> total = new HashSet<>();
        total.add(texto2);
        total.add(texto1);
        double porcentaje = ((double) comunes.size() / palabras1.size()) * 100;

        System.out.println("Texto 1: " + contarPalabrasUnicas(texto1) + " palabras unicas");
        System.out.println("Texto 2: " + contarPalabrasUnicas(texto2) + " palabras unicas");
        System.out.println("Palabras Comunes = " + comunes.size());
        System.out.printf("Coincidencia léxica: %.2f%%\n", porcentaje);
        System.out.println("Texto 1: " + palabras1);
        System.out.println("Texto 2: " + palabras2);

    }

}
