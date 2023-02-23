package Java_Basic.OperadoresyVariables;

public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = 5;
        var resultado = a >= 0 && a == 5; //Es Linea de codigo se declara &&, que es igual a and

        if (resultado) {
            System.out.println("Dentro del Rango");
        } else {
            System.out.println("Fuera del rango");
        }

        var vacaciones = false;
        var diaDescanso = false;
        var domingo = false;

        //  || or
        if (vacaciones || diaDescanso || domingo) //cualquier condicional que se cumpla, va ingresar al if
        {
            System.out.println("Puedo Tomar vacaciones ");
        }
        else
        {
            System.out.println("No puedo beber");
        }
    }
}


