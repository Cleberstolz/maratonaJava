package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {


// Operadores Aritiméticos
        /*

         + => Adição,
         - => Subtração
         / => Divisão
         * => Multiplicaçao

         */

/*
  Dessa forma se utilizarmos o operador + dentro do sout o que vier antes de uma string
  vai contar como SOMA e depois de uma string ele vai contar como concatenação.
 */

        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01 + numero02 + " Valor " + numero02 + numero01);

/*
  Outra forma de somar é criar uma nova variável.
 */

        int numero03 = 10;
        int numero04 = 20;
        int resultado = numero03 + numero04;
        System.out.println(resultado);

/*
  Na divisão temos que tomar cuidado pois se voce declarar como número inteiro ele vai retornar um número inteiro,
  se voce declarar com double ou float ele retorna números com ponto flutuante. Exemplos:
 */

        int numero05 = 10;
        int numero06 = 20;
        int resultado2 = numero05 / numero06;
        System.out.println(resultado2);

        double numero07 = 10;
        double numero08 = 20;
        double resultado3 = numero07 / numero08;
        System.out.println(resultado3);

// Operadores Relacionais

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


// Operadores Logicos

        /*
            && - And
            || - Or
            !  - Negação
         */

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlastationCompravel = valorContaCorrente > valorPlaystation || valorContaPoupanca > valorPlaystation;
        System.out.println("isPlastationCompravel " + isPlastationCompravel);

// Operadores de Atribuição

        /*
            =
            +=
            -=
            *=
            /=
            %=
         */

        double bonus = 1800;
        bonus += 1000; // é a mesma coisa que: bonus = bonus + 1000 e isso funciona para os outros também.
        System.out.println(bonus);


        /*
            ++
            --
         */


        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador ++; // é igual contador += 1
        contador --;
        ++contador; // colocar antes ele executa a incrementaçao antes
        --contador;
        int contador2 = 0;
        System.out.println(contador2++); //retornou 0 pois ele incrementou depois de printar o contador
    }
}
