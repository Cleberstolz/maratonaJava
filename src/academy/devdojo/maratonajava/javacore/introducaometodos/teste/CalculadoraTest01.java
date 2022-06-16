package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("================");
        calculadora.subtraiDoisNumeros();
        System.out.println("================");
        calculadora.multiplicaNumeros(10, 40);
        System.out.println("================");

        double result = calculadora.divideDoisNumeros(20, 10);
        System.out.println(result);
    }
}
