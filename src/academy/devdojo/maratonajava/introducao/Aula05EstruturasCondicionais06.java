package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {

    // Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
    // Considerando 1 como domingo

    public static void main(String[] args) {
        byte dia = 2;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}

