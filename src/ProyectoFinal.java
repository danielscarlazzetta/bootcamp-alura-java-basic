import java.util.Scanner;

public class ProyectoFinal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double saldo = 2000.00;
        String cliente = "Tonny Stark";
        String tipoCuenta = "Corriente";
        int opcionMenu = 0;
        System.out.println("Bienvenido: " + cliente);
        System.out.println("Su monto actual es de: " + saldo);
        System.out.println("SU tipo de cuenta actual es: " + tipoCuenta + "\n");


        while(opcionMenu != 9){
            System.out.println("""
                *****************************************
                Escriba en el menu la opcion deseada    *
                *****************************************
                 1 - Ver estado de la cuenta            *
                 2 - Girar dinero                       *
                 3 - Abonar                             *
                 9 - Salir                              *
                *****************************************
                """);
            opcionMenu = teclado.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("Estimado " + cliente +" el estado de cuenta es : $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a girar:");
                    double giro = teclado.nextDouble();
                    if (giro > 0 && giro <= saldo) {
                        saldo -= giro;
                        System.out.println("Has girado $" + giro + ", Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Monto inválido o saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a abonar: ");
                    double abono = teclado.nextDouble();
                    if (abono > 0) {
                        saldo += abono;
                        System.out.println("Has abonado $" + abono + ". Nuevo saldo: $" + saldo);
                    } else {
                        System.out.print("Monto inválido en cu cuenta "+ tipoCuenta);
                    }
                    break;
                case 9:
                    System.out.println("Gracias sr. "+cliente+" por usar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }

        }

    }
}
