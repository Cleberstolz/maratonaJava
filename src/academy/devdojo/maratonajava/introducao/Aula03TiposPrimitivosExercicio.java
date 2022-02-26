package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Cleberson";
        String endereco = "Rua dos principes - Mafra/SC";
        double salario = 2500.52;
        String dataRecebimento = "18/03/2021";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de " + salario + ", na data " + dataRecebimento;

        System.out.println(relatorio);

    }
}
