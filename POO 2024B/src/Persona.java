//Ejercicio para determinar clases, atributos y metodos
// Crear la clase llamada Persona
public class Persona {
    //Definir los atributos de la clase con private
    String nombre, genero;
    int edad;

    // Constructor
    public Persona(String nombre, String genero, int edad) {
        //Diferenciar los atributos de la clase con los parametros del constructor
        //Se utiliza this
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //Metodo para presentarse
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    //Metodo principal para crear objetos y llamarlos
    public static void main(String[] args) {
        //Creación de dos objetos
        Persona persona1 = new Persona("Danna", "Femenino", 21);
        Persona persona2 = new Persona("Joel", "Masculino", 23);

        //Llamada al metodo presentarse
        persona1.presentarse();
        persona2.presentarse();
    }
}

