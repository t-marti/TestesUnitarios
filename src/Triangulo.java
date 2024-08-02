/*Especifique um conjunto de casos de teste para testar o programa a seguir:
O programa lê três valores inteiros (digamos A,B e C) que representam os lados de um
triângulo. O programa informa se estes valores formam um triângulo e, em caso positivo, se
os lados formam um triângulo isósceles, escaleno ou equilatero.
Condição para ser um triângulo: a soma de dois lados tem que ser maior que o terceiro lado.

 */

public class Triangulo {
    private float a, b, c;

    public Triangulo (float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean eTriangulo() {
        return(a+b > c && b+c > a && a+c > b && a != 0 && b !=0 && c !=0 );
    }
    public String tipoTri(){
        if(eTriangulo()){
            if(a==b && c==a && b==c) {
                return "Equilatero";
            }else if(a==b || c==a || b==c) {
                return "Isosceles";
            }else
                return "Escaleno";
        }
        else
            return "nao é um triangulo";
    }
}