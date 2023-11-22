
package S05_04;

public class Juguete_04 {
    // Atributos
    String nombre;
    String tipo;
    double precio;

    // Constructor de la clase Juguete
    public Juguete_04(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Metodos
    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio: $" + precio);
    }

    public void jugar() {
        System.out.println("¡Estoy jugando con el juguete " + nombre + "!");
    }
    
}

