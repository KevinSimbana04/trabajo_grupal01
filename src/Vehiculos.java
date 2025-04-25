public class Vehiculos {
    //4 atributos
    //2 metodos
    //3 objetos

    //Atributos
    String modelo;
    String color;
    String placa;
    double velocidad_max;

    // constructor
    public Vehiculos() {

        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.velocidad_max = velocidad_max;
    }

    // Accion 1 , visualizacion de datos del  vehiculo

    public void mostrar_vehiculo(){
        System.out.println("Datos del Vehiculo \n");
        System.out.println("--------------------------\n");
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidad max: " + velocidad_max + "\n");
    }

    // Accion 2 ,Metodo para comparar velocidad con otro vehículo

    public void comparar_velocidad(Vehiculos otro) {
        if (this.velocidad_max > otro.velocidad_max) {
            System.out.println(this.modelo + " es más rápido que " + otro.modelo);
        } else if (this.velocidad_max < otro.velocidad_max) {
            System.out.println(otro.modelo + " es más rápido que " + this.modelo);
        } else {
            System.out.println("Ambos modelos tienen la misma velocidad.");
        }
    }
}
