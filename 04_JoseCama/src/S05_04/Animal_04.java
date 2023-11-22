
package S05_04;

public class Animal_04 {
    // Atributos
    String nombre;
    int edad;

    // Constructor de la clase Animal
    public Animal_04(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos
    public void imprimirInfo() {
        System.out.println("Nombre del animal: " + nombre);
        System.out.println("Edad del animal: " + edad);
    }

    public void emitirSonido(String sonido) {
        System.out.println(nombre + " emite el sonido: " + sonido);
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

}

