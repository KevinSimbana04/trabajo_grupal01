import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Vehiculos[] vehiculos = new Vehiculos[3];

        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i] = new Vehiculos();


            System.out.println("Ingrese el modelo del vehiculo");
            vehiculos[i].modelo = sc.nextLine();
            System.out.println("Ingrese el color");
            vehiculos[i].color = sc.nextLine();
            System.out.println("Ingrese la placa vehiculos");
            vehiculos[i].placa = sc.nextLine();
            System.out.println("Ingrese la velocida maxima");
            vehiculos[i].velocidad_max = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }

        System.out.println("Información de los empleados:");
        for (Vehiculos emp : vehiculos) { //Ciclo for
            emp.mostrar_vehiculo();
        }

        // compara velocidad entre los tres

        System.out.println("Comparaciones de velocidad:");
        vehiculos[0].comparar_velocidad(vehiculos[1]);
        vehiculos[1].comparar_velocidad(vehiculos[2]);

        //este es ub ejemplo de commit
        sc.close();

    }

}