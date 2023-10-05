
package S06_04;

public class calculadora_04 {
    
    // Atributos
   private double resultado;

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
    // Metodo para sumar dos números
    public double sumar(double a, double b) {
        resultado = a + b;
        return resultado;
    }
    // Metodo con valores de retorno para restar dos números
    public double restar(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    // Metodo con valores de retorno para obtener el resultado actual
    public double getResultado() {
        return resultado;
    }
}