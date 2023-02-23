package Java_Basic.SentenciasDeControl;

public class SentenciasDeControl
{
    public static void main(String[] args)
    {
        boolean condicion = true;

        if (condicion)
        {
            System.out.println("Condicion verdadera");

        }
        else
        {
            System.out.println("Condicion Falsa");
        }

        int x =11;
        if (x <=10 || x>12)
        {
            System.out.println("Es correcto");
        }
        else
        {
            System.out.println("Es incorrecto");
        }


        int numero  = 0;
        String text ="Numero Desconocido";

        if (numero==1)
        {
            text="Numero Uno";

        }
        else if (numero ==2)
        {
            text ="numero dos";
        }
        else if (numero ==3)
        {
            text ="numero tres";
        }
        else if (numero ==4)
        {
            text ="numero cuatro";
        }

        else
        {
         text = "Numero desconocido";
        }

        System.out.println("texto: "+text);


    }
}