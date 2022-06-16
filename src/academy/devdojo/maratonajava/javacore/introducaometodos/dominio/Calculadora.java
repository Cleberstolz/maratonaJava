package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaNumeros(int num, int num1) {
        System.out.println(num * num1);
    }

    public double divideDoisNumeros(double num, double num1) {
        if(num1 == 0){
            return 0;
        }
        return num/num1;
    }
}
