
package S06_04;

public class estudiante_04 {
    
    //Atributos
    private String nombre;
    private int edad;

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
    // Metodo para establecer el nombre del estudiante
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Metodo para establecer la edad del estudiante
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodo con valores de retorno para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // Metodo con valores de retorno para obtener la edad del estudiante
    public int getEdad() {
        return edad;
    }
}

