import Models.Cajero;
import Models.Empleado;
import Models.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Cajero> cajeros = new ArrayList<Cajero>();


        Cajero caj1 = new Cajero(1,1000000,5000000);

        empleados.add(caj1);

        personas.add(caj1);

        Empleado empleado1 = new Cajero(1,2000000,500000);
    }
}
