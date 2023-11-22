
package S06_04;

public class estudiante_04 {
    
    //Atributos
    String nombre;
    int edad;

    // Sobrecarga de Constructores
    // Constructor sin argumentos
    public estudiante_04() {
        nombre = "Sin Nombre";
        edad = 0;
    }
    // Constructor con dos argumentos
    public estudiante_04(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

