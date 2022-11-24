public class Main {
    public static void main(String[] args) {
/*
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
tienes que darles valor y mostrarlas por pantalla.
*/
        Cliente cliente = new Cliente();

        cliente.nombre = "Kevin";
        cliente.edad = 20;
        cliente.telefono = 632000000;
        cliente.credito = 130.13;

        System.out.println("Soy " + cliente.nombre + " tengo " + cliente.edad + " años y mi numero de telefono es " +
                cliente.telefono + " y mi credito disponible es de " + cliente.credito + " €");

        System.out.println("----------------------------------------------------------------------");

        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "Gerardo";
        trabajador.edad = 25;
        trabajador.telefono = 612000000;
        trabajador.salario = 2022.05;

        System.out.println("Soy " + trabajador.nombre + " tengo " + trabajador.edad + " años y mi numero de telefono es " +
                trabajador.telefono + " y mi credito disponible es de " + trabajador.salario + " €");
    }
}

/*Crea una clase Persona con las siguientes variables:
    La edad
    El nombre
    El teléfono
    */

class Persona{

    int edad;
    String nombre;
    int telefono;
}

//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable
// credito solo para esa clase,

class Cliente extends Persona{
    double credito;
}

//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que
// solo tenga la clase Trabajador.

class Trabajador extends Persona{
    double salario;

}