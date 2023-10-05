package S07_04;

public class Main_S07_04 {    
    public static void main(String[] args) {
        Videojuego_04 juego = new Videojuego_04("Mario Kart", 2017);
        Pelicula_04 pelicula = new Pelicula_04("Inception", 2010);

        System.out.println("Información del videojuego:");
        System.out.println("Nombre: " + juego.getNombre());
        System.out.println("Año de lanzamiento: " + juego.getLanzamiento());

        System.out.println("\nInformación de la película:");
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Año de estreno: " + pelicula.getEstreno());
    }
}
