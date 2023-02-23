package Java_Basic.ClasesYObjetos;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        Persona objPersona = new Persona();


        objPersona.nombre= "Luis";
        objPersona.apellido= "Reyes";
        objPersona.edad= 24;
        objPersona.genero= "Masculino";
        objPersona.nacionalidad= "Mexican";


       objPersona.MostrarInformacion();



    }
}
