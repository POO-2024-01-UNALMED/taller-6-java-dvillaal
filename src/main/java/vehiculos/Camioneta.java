package vehiculos;

public class Camioneta extends Vehículo {
    private boolean volco;
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco){
        super(placa ,puertas ,90, nombre, precio, peso,"4X4",fabricante );
        this.volco=volco;
    }

}
