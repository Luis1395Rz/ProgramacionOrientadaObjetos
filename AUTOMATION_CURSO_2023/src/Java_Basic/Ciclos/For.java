package Java_Basic.Ciclos;

public class For
{
    public static void main(String[] args)
    {
      /*for(int i=0; i<=20; i++) //Este incremento se usa de uno a uno

      {
          System.out.println("For i incremento de 1: " +i);

      }
        for(int i=0; i<10; i+=2) //Esta Sintaxis se usa para decidir el incremento

        {
            System.out.println("For i  incremento de 2 : " +i);
        }
*/

        for (int i=1; i<=10; i++)
        {
            if(i==5)
            {
                break; //Rompe el ciclo es decir ya no llegaria al 6 ni hasta el 10 una vez que encuentre el 5 ahi se para
                //continue;//No pares
            }
            System.out.println("For 3: " +"" + i);
        }

        for (int i=1; i<=10; i++)
        {
            if(i==5)
            {
                //break; //Rompe el ciclo es decir ya no llegaria al 6 ni hasta el 10 una vez que encuentre el 5 ahi se para
                continue;//No lo imprime se lo salta no pares continua hasta el 10
            }
            System.out.println("For 3: " +"" + i);
        }


    }

}
