public class Main {
    public static void main(String[] args) {



        int  fechaDeLanzamiento = 1990;
        String pelicula = "Matrix";
        boolean incluidoEnPlan = true;
        double  notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) /3;
        //System.out.println(media);

//        System.out.println(fechaDeLanzamiento);

        int num = 5;
        int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado
        //System.out.println(num); // imprime 6
        //System.out.println(resultado); // imprime 6

        System.out.println("Pelicula: " + pelicula);
        String sinopsis = """
                Matrix es una espectacvular pelicula
                fue a finales de milenio
                y se lanzo el:
                """ + fechaDeLanzamiento + """ 
                
                Con una nota de: 
                """ + notaDeLaPelicula;

        System.out.println(sinopsis);
        //System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares"));

        /*
        * Casting explícito
        El casting explícito se realiza cuando el tipo de dato de origen es
        * incompatible con el tipo de dato de destino. En este caso, debemos
        utilizar el operador de casting para realizar la conversión:
        */
        double x = 10.5;
        int y = (int) x; // casting explícito
        System.out.println("este es el valor de Casting explicito: "+ y);
        /*
        En el ejemplo anterior, el valor de la variable x se convierte en un valor
        entero utilizando el casting explícito
        */

        int clasificacion = (int) notaDeLaPelicula;
        int dato = clasificacion /2;
        System.out.println(clasificacion);
        System.out.println(dato);

        //forma correta

        int clasificacion2 = (int) media/2;
        System.out.println(clasificacion2);

    }
}