package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private País país;
    private int vehiculosCreados;
    private ArrayList<Vehículo> vehículos = new ArrayList<Vehículo>();
    private static ArrayList<Fabricante> fabricantes;

    public Fabricante(String nombre, País país){
        this.nombre = nombre;
        this.país = país;

        if (fabricantes == null){
            fabricantes = new ArrayList<Fabricante>();
        }

        fabricantes.add(this);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public País getPaís(){
        return país;
    }
    public void setPaís(País país){
        this.país = país;
    }

    public int getVehiculosCreados(){
        return vehiculosCreados;
    }

    public void añadirVehiculo(Vehículo vehículo){
        this.vehículos.add(vehículo);
        this.país.añadirVehiculo(vehículo);
        this.vehiculosCreados++;
    }

    public static Fabricante fabricaMayorVentas () {

        Fabricante fabrica;

        for (Fabricante i : fabricantes) {

            int k = 0;

            for (Fabricante j: fabricantes) {

                if (j.vehículos.size() > i.vehículos.size() && i != j) {

                    k = 1;
                    break;
                }

            }

            if (k == 0) {
                fabrica = i;

                return (fabrica);
            }

        }

        fabrica = null;
        return (fabrica);
    }
}
