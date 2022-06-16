package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.nome = "Camaro";
        carro.modelo = "SS";
        carro.ano = 2015;

        Carro carro1 = new Carro();
        carro1.nome = "Nissan";
        carro1.modelo = "370z";
        carro1.ano = 2010;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("---------------");

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
    }
}
