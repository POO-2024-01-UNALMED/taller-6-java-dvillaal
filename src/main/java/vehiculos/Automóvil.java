package vehiculos;

public class Automóvil extends Vehículo {
    private int puestos;
    public Automóvil(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso,"FWD",fabricante );
        this.puestos=puestos;
    }

    public int getPuestos() {
        return puestos;
    }
    public void setPuestos(int puestos){
        this.puestos = puestos;
    }

}
