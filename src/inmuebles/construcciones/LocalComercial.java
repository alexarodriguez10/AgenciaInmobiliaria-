package inmuebles.construcciones;

import AgenciaClases.TipoConstruccion;
import inmuebles.Construccion;

public class LocalComercial extends Construccion {

    public LocalComercial(String ubicacion, int metrosCuadrados, TipoConstruccion tipo) {
        super(ubicacion, metrosCuadrados, tipo);
    }

    //Propiedad calculada
    public int precio() {
        return (1000 * this.metrosCuadrados);
    }
    
    //Implementacion del metodo muestra
    @Override
    public void muestra() {
        System.out.println(".:Local Comercial:.");
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Precio del Local: " + precio());
        System.out.println("Area (mtsCuadrados): " + metrosCuadrados);
        System.out.println("Tipo de Construccion: " + tipo.name());
    }
}
