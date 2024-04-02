package vehiculos;

import java.util.ArrayList;

public class País {
    private String nombre;
    private int vehiculosCreados;
    private ArrayList<Vehículo> vehículos = new ArrayList<Vehículo>();
    private static ArrayList<País> países;

    public País(String nombre){
        this.nombre = nombre;

        if (países == null){
            países = new ArrayList<País>();
        }

        países.add(this);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getVehiculosCreados(){
        return vehiculosCreados;
    }

    public void añadirVehiculo (Vehículo vehículo){
        this.vehículos.add(vehículo);
        this.vehiculosCreados++;
    }
}
