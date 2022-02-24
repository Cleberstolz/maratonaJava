package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
            Quando tiver mais que 2 condiçoes ai voce pode usar o ELSE IF (senao se) EX:
         */

        // idade < 15 categoria infantil
        // idade >= 15 && < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 10;
        String categoria = "";
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
