package Java_Basic.ModificadoresDeAcceso;

public class ModificadorPrivate
{
   private void ejemploTres()
   {
       System.out.println("No c puede acceder a este metodo desde otra clase. ya que es privado ");

       /*
       Modificador de acceso Private es el más restrictivo y especifica que los elementos que lo utilizan,
       solo pueden ser accedidos desde la clase en la que se encuentran, la unica manera de acceder a ellos
       es a tarves del metodo getter y setter. Al utilizar metodos private se puede entender que estamos encapsulando codigo

       * */
   }
}
