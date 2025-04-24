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
    public Vehiculos(String modelo, String color, String placa, double velocidad_max) {

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
        System.out.println("Velocidad max: " + velocidad_max);
    }

    // Accion 2 ,
    public void velocidad_velocidad(){

    }

}
