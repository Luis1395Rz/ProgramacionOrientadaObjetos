package Java_Basic.ModificadoresDeAcceso;

class ModificadorDefault2
{

    public static void main(String[] args)
    //Se esta creando un objeto por medio de la palabra reservada new
    {
        ModificadorDefault objModificadorDefault = new ModificadorDefault();
        objModificadorDefault.ejemplo();
        objModificadorDefault.ejemploDos();

        MetodoPublico objModificadorPublic = new MetodoPublico();
        objModificadorPublic.ejemploCuatro();

        /*Modificador de acceso por defecto, nos permite acceder a los metodos o atributos de una clase,
        siempre y cuando se encuentren en el mismo package, sino estuvieran las dos clases en el mismo package, al utilizar este
        modificador de acceso, nos devolveria un error de compilacion*/
    }


}
