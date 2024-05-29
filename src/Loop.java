import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

         double nota = 0;
         double promedionotas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el promedio de notas: ");
            nota = teclado.nextDouble();
            promedionotas =+ promedionotas + nota;
        }

        System.out.println(" la media de notas es: " + promedionotas/3);
    }
}
