
package S06_04;

public class Main_S06_04 {

    public static void main(String[] args) {
        // Uso de la class Calculadora
        calculadora_04 miCalculadora = new calculadora_04();
        double resultadoSuma = miCalculadora.sumar(5, 3);
        double resultadoResta = miCalculadora.restar(10, 4);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);

        // Uso de la class Estudiante
        estudiante_04 est1 = new estudiante_04("Juan", 20);
        estudiante_04 est2 = new estudiante_04();
        est2.setNombre("María");
        est2.setEdad(18);

        System.out.println("Estudiante 1: Nombre: " + est1.getNombre() + ", Edad: " + est1.getEdad());
        System.out.println("Estudiante 2: Nombre: " + est2.getNombre() + ", Edad: " + est2.getEdad());
        
    }
    
}
