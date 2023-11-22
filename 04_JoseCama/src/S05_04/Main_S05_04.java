
package S05_04;

public class Main_S05_04 {
    
    public static void main(String[] args) {
        // Crear objeto Animal
        Animal_04 perro = new Animal_04("Max", 3);

        // Llamar a los métodos del objeto Animal
        perro.imprimirInfo();
        perro.emitirSonido("Ladrido");
        perro.comer();
        
         // Crear objeto Juguete
        Juguete_04 rompecabezas = new Juguete_04("Rompecabezas 3D", "Educativo", 19.99);

        // Llamar a los métodos del objeto Juguete
        rompecabezas.imprimirInfo();
        rompecabezas.jugar();
        
    }
        
}