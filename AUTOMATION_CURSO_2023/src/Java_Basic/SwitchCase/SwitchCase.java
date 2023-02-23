package Java_Basic.SwitchCase;

public class SwitchCase
{
    public static void main(String[] args)
    {
        var numero =7;
        var numeroTexto ="ValorDesconocido";

        switch (numero)
        {
            case 1:
              numeroTexto = "Numero UNO";
               break;

            case 2:
                numeroTexto = "Numero Dos";
                break;

            case 3:
                numeroTexto = "Numero Tres";
                break;

            case 4:
                numeroTexto = "Numero Cuatro";
                break;

            case 5:
                numeroTexto = "Numero cinco";
                break;

            default:
                numeroTexto="Desconozco el numero";

        }
        System.out.println("Texto:  " + numeroTexto);

    }
}
