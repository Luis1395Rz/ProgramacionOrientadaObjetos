package Java_Basic.SentenciasDeControl;

public class Calificaciones
{
        public static void main(String[] args)
        {
            float Matematicas = 9.5F;
            float  Biologia= 7.4F;
            float Quimica = 6.5F;
            double prom;
            double random =Math.random();

             prom= Math.round(Matematicas+Biologia+Quimica)/3;

            System.out.println("El Calificacion de Matematicas: " +Matematicas);
            System.out.println("El Calificacion de Biologia es: " +Biologia);
            System.out.println("El Calificacion de Quimica es: " +Quimica);
            System.out.println("El promedio de tus calificacion es: " +prom);

            if (prom >= 6 && prom<=10)
            {
                System.out.println("Estas Pasado");
            }
            else
            {
                System.out.println("Estas reprobado ");
            }




        }

}
