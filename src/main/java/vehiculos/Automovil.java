package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    private static int CantidadVehiculos;
<<<<<<< HEAD:src/main/java/vehiculos/Automovil.java
    public Automovil(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
=======
    
    public Automóvil(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
>>>>>>> 4c414f8f22f713a69d85ffacca2cc98d34f60635:src/main/java/vehiculos/Automóvil.java
        super(placa, 4, 100, nombre, precio, peso,"FWD",fabricante );
        this.puestos=puestos;
    }

    public int getPuestos() {
        return puestos;
    }
    public void setPuestos(int puestos){
        this.puestos = puestos;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

}
