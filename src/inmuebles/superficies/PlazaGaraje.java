package inmuebles.superficies;

import AgenciaClases.TipoGaraje;
import inmuebles.Superficie;

public class PlazaGaraje extends Superficie {

    private TipoGaraje tipo;

    public PlazaGaraje(String ubicacion, int metrosCuadrados, TipoGaraje tipo) {
        super(ubicacion, metrosCuadrados);
        this.tipo = tipo;
    }

    
    public TipoGaraje getTipo() {
        return tipo;
    }

    public void setTipo(TipoGaraje tipo) {
        this.tipo = tipo;
    }
    
    
    @Override
    public void muestra() {
        System.out.println(".:Plaza Garaje:.");
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Area (mtsCuadrados): " + metrosCuadrados);
        System.out.println("Precio: $" + super.precio());
        System.out.println("Tipo de Garaje: " + tipo.name());
    }
}
