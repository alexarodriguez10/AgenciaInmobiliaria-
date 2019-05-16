package inmuebles;

import AgenciaClases.Inmueble;
import AgenciaClases.TipoConstruccion;

public abstract class Construccion extends Inmueble {

    protected TipoConstruccion tipo;

    protected Construccion(String ubicacion, int metrosCuadrados, TipoConstruccion tipo) {
        super(ubicacion, metrosCuadrados);
        this.tipo = tipo;
    }

    public TipoConstruccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoConstruccion tipo) {
        this.tipo = tipo;
    }
}
