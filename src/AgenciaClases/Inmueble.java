package AgenciaClases;

public abstract class Inmueble {

    protected String ubicacion;
    protected int metrosCuadrados;

    protected Inmueble(String ubicacion, int metrosCuadrados) {
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
    
    public abstract void muestra();
}
