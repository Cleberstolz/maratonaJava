package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        // while, do while e for


        //WHILE
        int count = 0;

        while (count < 10) {
            System.out.println("While " + ++count);
        }

        //DO WHILE
        count = 0;
        do {
            System.out.println("Do While " + ++count);
        } while (count < 10);


        // FOR
        for (int i=0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
