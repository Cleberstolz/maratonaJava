package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {

    //imprima os primeiros 25 números de um valor máximo, 50 por exemplo.
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
