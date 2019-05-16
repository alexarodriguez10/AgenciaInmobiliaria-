package AgenciaClases;

import excepciones.InmuebleInvalidoException;
import inmuebles.construcciones.LocalComercial;
import inmuebles.construcciones.Vivienda;
import inmuebles.superficies.PlazaGaraje;
import inmuebles.superficies.Solar;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AgenciaInmobiliaria implements Agencia {

    private final ArrayList<Inmueble> listaVentas;
    private final ArrayList<Inmueble> listaAlquileres;
    private final String nombreAgencia;

    public AgenciaInmobiliaria(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
        this.listaVentas = new ArrayList<>();
        this.listaAlquileres = new ArrayList<>();
    }

    @Override
    public boolean añadeVentaInmueble(Inmueble inmueble) throws InmuebleInvalidoException {
        if (!listaVentas.contains(inmueble)) {
            if ((inmueble instanceof Solar) || (inmueble instanceof Vivienda)) {
                listaVentas.add(inmueble);
                return true;
            } else {
                throw new InmuebleInvalidoException("El Inmueble No es Apto para Ventas!");
            }
        }

        return false;
    }

    @Override
    public boolean añadeAlquilerInmueble(Inmueble inmueble) throws InmuebleInvalidoException {
        if (!listaAlquileres.contains(inmueble)) {
            if ((inmueble instanceof PlazaGaraje) || (inmueble instanceof LocalComercial)) {
                listaAlquileres.add(inmueble);
                return true;
            } else {
                throw new InmuebleInvalidoException("El Inmueble No es Apto para Alquileres!");
            }
        }

        return false;
    }

    @Override
    public List<Inmueble> inmueblesVenta(int precio) {
        LinkedList<Inmueble> listaInmuebles = new LinkedList<>();
        for (int i = 0; i < listaVentas.size(); i++) {
            Inmueble inmueble = listaVentas.get(i);
            if (inmueble instanceof Solar) {
                if (((Solar) inmueble).precio() < precio) {
                    listaInmuebles.add(inmueble);
                }
            } else if (inmueble instanceof Vivienda) {
                if (((Vivienda) inmueble).getPrecio() < precio) {
                    listaInmuebles.add(inmueble);
                }
            }
        }

        return listaInmuebles;
    }

    @Override
    public List<LocalComercial> localesSegundaMano(int area) {
        LinkedList<LocalComercial> listaLocales = new LinkedList<>();
        for (int i = 0; i < listaAlquileres.size(); i++) {
            Inmueble inmueble = listaAlquileres.get(i);
            if (inmueble instanceof LocalComercial) {
                LocalComercial local = (LocalComercial) inmueble;
                int areaLocal = local.metrosCuadrados;
                if (areaLocal > area) {
                    listaLocales.add(local);
                }
            }
        }

        return listaLocales;
    }

    @Override
    public int solaresRusticos() {
        int contador = 0;
        for (int i = 0; i < listaVentas.size(); i++) {
            Inmueble inmueble = listaVentas.get(i);
            if (inmueble instanceof Solar) {
                ZonaSolar var = ((Solar) inmueble).getZona();
                if (var.equals(ZonaSolar.RUSTICO)) {
                    contador = contador + 1;
                }
            }
        }

        return contador;
    }
}
