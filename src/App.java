public class App {
    public static void main(String[] args) throws Exception {

        Cliente miCliente = new Cliente();
        miCliente.nombre = "Roberto";
            miCliente.edad = 45;
            miCliente.telefono = 443355;
            miCliente.setCredito(30000);

        System.out.println("Clase Cliente");
        System.out.println("Nombre: " + miCliente.nombre);
        System.out.println("Edad: " + miCliente.edad);
        System.out.println("Telefono: " + miCliente.telefono);
        System.out.println("Credito: " + miCliente.getCredito());

        System.out.println("\n");

        System.out.println("Clase Trabajador");
        Trabajador miTrabajador = new Trabajador();
            miTrabajador.nombre = "Ramiro";
            miTrabajador.edad = 25;
            miTrabajador.telefono = 445565;
            miTrabajador.setSalario(25000);

        System.out.println("Nombre: " + miTrabajador.nombre);
        System.out.println("Edad: " + miTrabajador.edad);
        System.out.println("Telefono: " + miTrabajador.telefono);
        System.out.println("Credito: " + miTrabajador.getSalario());
    }
}
class Persona {
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona {
    private int credito;
    public int getCredito() {
        return credito;
    }

    public void setCredito(int valor) {
        this.credito = valor;
    }
}

class Trabajador extends Persona {
    private int salario;
    public int getSalario() {
        return salario;
    }
    public void setSalario(int valor){
        this.salario = valor;
    }
}


// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de
// Persona, y con una variable salario que solo tenga la clase Trabajador.