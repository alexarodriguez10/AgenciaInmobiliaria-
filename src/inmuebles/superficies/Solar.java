package inmuebles.superficies;

import AgenciaClases.ZonaSolar;
import inmuebles.Superficie;

public class Solar extends Superficie {

    private ZonaSolar zona;

    public Solar(String ubicacion, int metrosCuadrados, ZonaSolar zona) {
        super(ubicacion, metrosCuadrados);
        this.zona = zona;
    }

    //Metodos de consulta
    public ZonaSolar getZona() {
        return zona;
    }

    public void setZona(ZonaSolar zona) {
        this.zona = zona;
    }
    
    //Implementacion del metodo muestra
    @Override
    public void muestra() {
        System.out.println(".:Solar:.");
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Area (mtsCuadrados): " + metrosCuadrados);
        System.out.println("Zona: " + zona.name());
        System.out.println("Precio: $" + super.precio());
    }
}
