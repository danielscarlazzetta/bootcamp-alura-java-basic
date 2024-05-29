public class Decisiones {

    public static void main(String[] args) {

        int  fechaDeLanzamiento2 = 1999;
        boolean incluidoEnPlan2 = true;
        double  notaDeLaPelicula2 = 8.2;
        String tipoDePlan = "plus";

        if(fechaDeLanzamiento2 > 2022){
            System.out.println(
                    "Pelicula mas populares"
            );
        } else{
            System.out.println("Pelicula antigua");
        }

         if(incluidoEnPlan2 && tipoDePlan.equals("plus")){
             System.out.println("Puedes ver la pelicula");
         }else{
             System.out.println("No puedes ver la pelicula Pelicula");
         }
    }
}

