package AgenciaClases;

import excepciones.InmuebleInvalidoException;
import inmuebles.construcciones.LocalComercial;
import java.util.List;

public interface Agencia {
    boolean añadeVentaInmueble(Inmueble inmueble) throws InmuebleInvalidoException;
    boolean añadeAlquilerInmueble(Inmueble inmueble) throws InmuebleInvalidoException;
    List<Inmueble> inmueblesVenta(int precio);
    List<LocalComercial> localesSegundaMano(int area);
    int solaresRusticos();
}
