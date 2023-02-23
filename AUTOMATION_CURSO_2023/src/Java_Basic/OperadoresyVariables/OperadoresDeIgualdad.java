package Java_Basic.OperadoresyVariables;

public class OperadoresDeIgualdad
{
    public static void main(String[] args)
    {
        var a = 5;
        var b = 3;


        var c = (a==b);
        System.out.println("c = "+ c);

        var cadena ="Hola";
        var cadenaDos = "hola";
        var validacion = cadena ==cadenaDos;

        System.out.println("El resultado es: "+ validacion); //compara referencia de objetos
        var validacionDos = cadena.equals(cadenaDos);
        System.out.println("El resultado de la validacion 2 es: " +validacionDos); //equals es igual a igual 

    }
}
