package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {

    // Operador ternario = String variavel = condiçao ? verdadeiro : falso;

    public static void main(String[] args) {
        double salario = 3000;

        String resultado = salario > 5000 ? "Eu vou doar 500 para o DevDojo" : "Ainda nao tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
