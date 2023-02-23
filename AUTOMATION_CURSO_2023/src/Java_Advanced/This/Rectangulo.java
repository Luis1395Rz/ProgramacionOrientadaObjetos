package Java_Advanced.This;

public class Rectangulo
{
    private int base, altura, area; //para almacenar
    public Rectangulo(int base, int altura) //constructor le estamos pasando parametros nos van a traer informacion
    {
        this.base=base; //this es para variables globales
        this.altura=altura;
    }

    public void CalculoArea()
    {
        area=base * altura;
    }

    public void imprimir()
    {
        CalculoArea();
        System.out.println("El area es : " +area);
    }

}
