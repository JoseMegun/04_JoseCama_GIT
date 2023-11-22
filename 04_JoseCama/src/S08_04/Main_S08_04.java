
package S08_04;

public class Main_S08_04 {
    
    public static void main(String[] args) {
        // Objeto del class Deporte_04
        Deporte_04 deporte = new Deporte_04("Futbol", 1863);
        // Objeto del class Turismo_04
        Turismo_04 turismo = new Turismo_04("París", 1850);

        // Uso del class Deporte_04
        System.out.println("Información del deporte:");
        System.out.println("Nombre: " + deporte.getNombre());
        System.out.println("Año de fundación: " + deporte.getAñoFundacion());

        // Uso del class Turismo_04
        System.out.println("\nInformación del turismo:");
        System.out.println("Destino: " + turismo.getDestino());
        System.out.println("Año de inicio: " + turismo.getAñoInicio());
    }
}