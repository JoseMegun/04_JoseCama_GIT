
package S06_04;

public class calculadora_04 {
    
    // Atributos
    double resultado;

   // Sobrecarga de Constructores
    // Constructor sin argumentos
    public void Calculadora() {
        resultado = 0;
    }
    // Constructor con un argumento
    public void Calculadora(double valorInicial) {
        resultado = valorInicial;
    }

    // Metodos
    public double sumar(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    public double restar(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }
}