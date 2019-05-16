package inmuebles.construcciones;

import AgenciaClases.TipoConstruccion;
import inmuebles.Construccion;

public class Vivienda extends Construccion {

    private int precio;
    private int numHabitaciones;
    private int piso;

    public Vivienda(String ubicacion, int metrosCuadrados, TipoConstruccion tipo, int precio, int numHabitaciones, int piso) {
        super(ubicacion, metrosCuadrados, tipo);
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.piso = piso;
    }

    //Metodos de Consulta
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    //Implementacion del metodo muestra
    @Override
    public void muestra() {
        System.out.println(".:Vivienda:.");
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Area (mtsCuadrados): " + metrosCuadrados);
        System.out.println("Tipo de Construccion: " + tipo.name());
        System.out.println("Precio: $" + precio);
        System.out.println("Numero de Habitaciones: " + numHabitaciones);
        System.out.println("Piso: " + piso);
    }
}
