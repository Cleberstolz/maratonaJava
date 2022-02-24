package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        /*
            basicamente os ifs sao se algo for verdade execute isso se for falso execute aquilo
         */

        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");

        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado");
        }

        /*
            O else é o senão e voce usa juntamente com o if, exemplo SE eu tiver dinheiro eu compro SENAO eu nao compro.
         */

        double minhaCarteira = 3000.00;
        double bmw = 200000.0;

        if (minhaCarteira > bmw) {
            System.out.println("Posso comprar");
        } else {
            System.out.println("Não posso comprar");
        }
    }
}
