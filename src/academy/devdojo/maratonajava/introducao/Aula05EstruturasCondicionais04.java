package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        //€ 0        € 34,712   9.70%
        //€ 34,713   € 68,507   37.35%
        //€ 68,508              49.50%

        double salarioAnual = 70000;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = (9.70 / 100) * salarioAnual;
            System.out.println(valorImposto);

        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            valorImposto = (37.35 / 100) * salarioAnual;
            System.out.println(valorImposto);

        } else {
            valorImposto = (49.50 / 100) * salarioAnual;
            System.out.println(valorImposto);
        }
    }
}
