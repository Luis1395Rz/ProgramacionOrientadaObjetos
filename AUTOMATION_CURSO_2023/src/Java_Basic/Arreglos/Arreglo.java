package Java_Basic.Arreglos;

public class Arreglo
{
    public static void main(String[] args)
    {
        int numeros [] = new int [5];

        numeros [0]=52;
        numeros [1]=125;
        numeros [2]=654;
        numeros [3]=454;
        numeros [4]=0;

        for (int i =0; i<=2; i++) //Se evita toda la talacha de mandar a imprimir uno por uno como en el arreglo bidemincional
        {
            System.out.println("[" + numeros[i] + "]");

        }

    }



}
