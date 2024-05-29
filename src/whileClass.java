import java.util.Scanner;

public class whileClass {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while(nota != -1){
            System.out.print("Ingrese el promedio de notas: ");
            nota = teclado.nextDouble();

            if(nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }

        }
        System.out.println(" la media de notas es: " + mediaEvaluaciones/totalEvaluaciones);

    }
}
