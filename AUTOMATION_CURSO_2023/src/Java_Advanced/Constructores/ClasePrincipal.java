package Java_Advanced.Constructores;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        //Instancia a  la clase que no tiene constructor
        SinConstructor sin = new SinConstructor();
        sin.PedirNombre();
        sin.Imprimir();


        ConConstructor con =new ConConstructor();

    }
}
