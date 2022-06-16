package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double
        // char '\u0000' ' '
        // String null

        String[] nomes = new String[3];

        nomes[0] = "Flash";
        nomes[1] = "Batman";
        nomes[2] = "Groot";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
