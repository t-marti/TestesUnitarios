import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrianguloTest {
    // Triângulo escaleno válido
    @Test
    public void testEscaleno(){
        Triangulo modelo1 = new Triangulo(3, 4, 5);
        Assertions.assertEquals("Escaleno", modelo1.tipoTri());
    }
    // Triângulo isósceles válido
    @Test
    public void testIsoseles(){
        Triangulo modelo2 = new Triangulo(4, 4, 5);
        Assertions.assertEquals("Isosceles", modelo2.tipoTri());
    }
    // Triângulo equilatero válido
    @Test
    public void testEquilatero(){
        Triangulo modelo3 = new Triangulo(3.33f, 3.33f, 3.33f);
        Assertions.assertEquals("Equilatero", modelo3.tipoTri());

    }
    // Valores negativos
    @Test
    public void eTriangulo(){
        Triangulo modelo4 = new Triangulo(-3.33f, -3.33f, -3.33f);
        Assertions.assertFalse(modelo4.eTriangulo());
    }
    // Pelo menos 3 casos de teste (CTs) para isósceles válido contendo a permutação
    //dos mesmos valores
    @Test
    public void permutandoIsosceles(){
        Triangulo modelo1 = new Triangulo(5, 4, 5);
        Triangulo modelo2 = new Triangulo(5, 5, 4);
        Triangulo modelo3 = new Triangulo(4, 5, 5);
        Assertions.assertEquals("Isosceles", modelo1.tipoTri());
        Assertions.assertEquals("Isosceles", modelo2.tipoTri());
        Assertions.assertEquals("Isosceles", modelo3.tipoTri());

    }
    // Um CT para os três valores iguais a zero
    @Test
    public void iguaiszero(){
        Triangulo modelo1 = new Triangulo(0, 0, 0);
        Assertions.assertFalse(modelo1.eTriangulo());
    }
    // Valores zero
    @Test
    public void umzero(){
        Triangulo modelo1 = new Triangulo(0, 3, 5);
        Assertions.assertFalse(modelo1.eTriangulo());
        Triangulo modelo2 = new Triangulo(3, 5, 0);
        Assertions.assertFalse(modelo2.eTriangulo());
        Triangulo modelo3 = new Triangulo(5, 0, 3);
        Assertions.assertFalse(modelo3.eTriangulo());
    }
    // A soma de 2 lados é igual ao terceiro lado,um CT para cada permutação de valores
    @Test
    public void somandolados(){
        Triangulo modelo1 = new Triangulo(5, 3, 8);
        Assertions.assertFalse(modelo1.eTriangulo());
        Triangulo modelo2 = new Triangulo(3, 5, 8);
        Assertions.assertFalse(modelo2.eTriangulo());
        Triangulo modelo3 = new Triangulo(8, 3, 5);
        Assertions.assertFalse(modelo3.eTriangulo());
        Triangulo modelo4 = new Triangulo(8, 5, 3);
        Assertions.assertFalse(modelo4.eTriangulo());
    }
    // CT em que a soma de 2 lados é menor que o terceiro lado
    //um CT para cada permutação de valores
    @Test
    public void ladosmenores(){
        Triangulo modelo1 = new Triangulo(5, 2, 8);
        Assertions.assertFalse(modelo1.eTriangulo());
        Triangulo modelo2 = new Triangulo(2, 5, 8);
        Assertions.assertFalse(modelo2.eTriangulo());
        Triangulo modelo3 = new Triangulo(8, 2, 5);
        Assertions.assertFalse(modelo3.eTriangulo());
        Triangulo modelo4 = new Triangulo(8, 5, 2);
        Assertions.assertFalse(modelo4.eTriangulo());
    }
}
