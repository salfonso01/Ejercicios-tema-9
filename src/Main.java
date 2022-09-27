public class Main {
    public static void main(String[] args) {
    //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();
    cliente.nombre = "Jorge";
    cliente.edad = 41;
    cliente.telefono = 22222222;
    cliente.credito = 121.14;
    System.out.println("Hola soy " + cliente.nombre + ", mi edad es " + cliente.edad + " años, mi teléfono es " + cliente.telefono
            + " tengo " + cliente.credito + "$ de credito disponible");

    trabajador.nombre = "Pedro ";
    trabajador.edad = 66    ;
    trabajador.telefono = 3333333;
    trabajador.salario = 1058.32;
    System.out.println("Hola soy " + trabajador.nombre + ", mi edad es  " + trabajador.edad + " años, mi teléfono es " + trabajador.telefono
            + " mi sueldo es " + trabajador.salario + "$");
    }
}


// Crear clase Persona con las siguientes variables: La edad, El nombre, El teléfono
class Persona {
     int edad;
     String nombre;
     int telefono; 
}

// crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable 
// credito solo para esa clase.

class Cliente extends Persona {
    double credito;
}


// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
// y con una variable salario que solo tenga la clase Trabajador.

class Trabajador extends Persona {
    double salario;
}

