public class Persona {
    String nombre;
    String apellido;
    String dni;
    String pais;
    char genero;
    int añoNacimiento;

    //Constructor por parametros
    public Persona(String nombre, String apellido, String dni, int añoNacimiento, String pais, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.añoNacimiento = añoNacimiento;
        this.pais = pais;
        this.genero = genero;
    }

    void Imprimir(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellido);
        System.out.println("Dni = " + dni);
        System.out.println("Año de Nacimiento = " + añoNacimiento);
        System.out.println("Pais = " + pais);
        System.out.println("Género = " + genero);
        System.out.println();
    }

    
}
