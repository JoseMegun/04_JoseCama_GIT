
package S05_04;

public class Main_S05_04 {
    
    public static void main(String[] args) {
        // Crear instancias de objetos Animal
        Animal_04 perro = new Animal_04("Max", 3);

        // Llamar a los métodos de los objetos Animal
        perro.imprimirInfo();
        perro.emitirSonido("Ladrido");
        perro.comer();
        
         // Crear instancias de objetos Juguete
        Juguete_04 rompecabezas = new Juguete_04("Rompecabezas 3D", "Educativo", 19.99);

        // Llamar a los métodos de los objetos Juguete
        rompecabezas.imprimirInfo();
        rompecabezas.jugar();
        
    }
        
}