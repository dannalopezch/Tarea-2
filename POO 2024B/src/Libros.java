//Crear la clase llamada Persona
public class Libros {
    //Definir los atributos de la clase con private
    String titulo, autor;
    int pagCount;

    // Constructor
    public Libros(String titulo, String autor, int pagCount) {
        //Diferenciar los atributos de la clase con los parametros del constructor
        //Se utiliza this
        this.titulo = titulo;
        this.autor = autor;
        this.pagCount = pagCount;
    }

    //Crear un metodo llamado infoLibro
    public void infoLibro() {
        System.out.println("Titulo del libro: " + titulo + "\t\tAutor: " + autor + "\t\tNúmero de páginas: " + pagCount);
    }

    //Metodo principal para crear objetos y llamarlos
    public static void main(String[] args) {
        //Creación de dos objetos
        Libros libro1 = new Libros("Nadie Como Tu", "Danna Mishelle", 500);
        Libros libro2 = new Libros("Harry Potter", "J.K Rowling", 390);

        //Llamada al metodo
        libro1.infoLibro();
        libro2.infoLibro();
    }
}
