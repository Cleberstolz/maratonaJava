package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*

         + => Adição,
         - => Subtração
         / => Divisão
         * => Multiplicaçao

         */

/*
  Dessa forma se utilizarmos o operador + dentro do sout o que vier antes de uma string
  ele vai contar como Soma e depois de uma string ele vai contar como concatenação.
 */

        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01 + numero02 + " Valor " + numero02 + numero01);

/*
  Outra forma de somar criar uma nova variavel.
 */

        int numero03 = 10;
        int numero04 = 20;
        int resultado = numero03 + numero04;
        System.out.println(resultado);

/*
  Na divisao temos que tomar cuidado pois se voce declarar como numero inteiro ele vai retornar um numero inteiro
  se voce declarar com double ou float ele retorna numeros com ponto flutuante exemplos:
 */

        int numero05 = 10;
        int numero06 = 20;
        int resultado2 = numero05 / numero06;
        System.out.println(resultado2);

        double numero07 = 10;
        double numero08 = 20;
        double resultado3 = numero07 / numero08;
        System.out.println(resultado3);

// Outros Operadores

        // % - Resto da divisão

        int resto = 21 % 7;
        System.out.println(resto);

        /*

         <  - Menor que
         >  - Maior que
         <= - Menor ou igual que
         >= - Maior ou igual que
         == - Igual
         != - Diferente

         */

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

    }
}
