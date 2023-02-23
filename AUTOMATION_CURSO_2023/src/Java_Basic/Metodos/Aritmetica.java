package Java_Basic.Metodos;

public class Aritmetica
{
    //Atributos

    int a=2;
    int b=3;
    int resultado;


    //Metodo Sumar
    public void sumar ()
    {
        int resultado = a + b;
        System.out.println("resultado: " + resultado);
    }

    //Metodo Sumar con Retorno
    public int SumarConRetorno() //debe devolver algo cuando no lleva el int
    {
        int resultado = a+b;
        return resultado;
        //return a + b; ------>>> Eato es correcto pero se queda comentado
    }





    //Parametros y argumentos es lo mismo

    public int SumarConParametros(int param1, int param2)
    {
        a= param1;
        b= param2;
        return a+b;
    }


}
