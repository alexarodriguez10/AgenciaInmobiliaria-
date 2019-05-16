package inmuebles;

import AgenciaClases.Inmueble;

public abstract class Superficie extends Inmueble {

    protected Superficie(String ubicacion, int metrosCuadrados) {
        super(ubicacion, metrosCuadrados);
    }

    //Propiedad calculable
    public int precio() {
        return (1000 * this.metrosCuadrados); //Precio arbitrario
    }
}
