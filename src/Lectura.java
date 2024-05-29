import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe en el siguente fomulario la pelicula");
        System.out.print("Escribe el nombre de la pelicula: ");
        String pelicula = teclado.nextLine();
        System.out.print("Escribe la fecha de lanzamiento: ");
        int fechaLanzamiento = teclado.nextInt();
        System.out.print("Agrega una valoracion: ");
        double valoracionPelicula = teclado.nextDouble();

        System.out.println(pelicula +"\n"+ fechaLanzamiento +"\n"+ valoracionPelicula);
    }
}
