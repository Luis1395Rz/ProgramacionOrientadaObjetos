package Java_Basic.Metodos;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.sumar();

        var resultado = aritmetica.SumarConRetorno();
        System.out.println("El resultado es: " + aritmetica.SumarConRetorno());





        resultado=aritmetica.SumarConParametros(10,25);
        System.out.println("Resultado usando Parametros:   " + resultado);
    }





}
