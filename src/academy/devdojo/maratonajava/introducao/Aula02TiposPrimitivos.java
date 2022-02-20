package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        double salarioDouble = 2000.8;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractereAscii = 65; //tabela ascii
        char caractereUnicode = '\u0041'; //valores unicode
        String nome = "Um texto";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char" + caractereAscii);
        System.out.println("char" + caractereUnicode);
        //para fazer o System out ... mais rapido é sout
        System.out.println(nome);
    }
}
