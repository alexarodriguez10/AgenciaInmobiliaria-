package main;

import AgenciaClases.AgenciaInmobiliaria;
import AgenciaClases.Inmueble;
import AgenciaClases.TipoConstruccion;
import AgenciaClases.TipoGaraje;
import AgenciaClases.ZonaSolar;
import excepciones.InmuebleInvalidoException;
import inmuebles.construcciones.LocalComercial;
import inmuebles.construcciones.Vivienda;
import inmuebles.superficies.PlazaGaraje;
import inmuebles.superficies.Solar;
import java.util.LinkedList;

public class App {

    /**
     * @param args the command line arguments
     * @throws excepciones.InmuebleInvalidoException
     */
    public static void main(String... args) throws InmuebleInvalidoException {
        AgenciaInmobiliaria agencia = new AgenciaInmobiliaria("Agencia SuperGenial");
        LocalComercial lc1, lc2, lc3;
        lc1 = new LocalComercial("Urbanizacion Riascos", 400, TipoConstruccion.NUEVA);
        lc2 = new LocalComercial("Villa Marbella", 600, TipoConstruccion.SEGUNDA_MANO);
        lc3 = new LocalComercial("Los Almendros", 650, TipoConstruccion.NUEVA);
        Vivienda v1, v2;
        v1 = new Vivienda("20 de Julio", 500, TipoConstruccion.SEGUNDA_MANO, 500000, 4, 2);
        v2 = new Vivienda("Bonda", 800, TipoConstruccion.NUEVA, 550000, 3, 1);
        PlazaGaraje pg1, pg2;
        pg1 = new PlazaGaraje("Los Almendros", 900, TipoGaraje.PRIVADO);
        pg2 = new PlazaGaraje("El Rodadero", 500, TipoGaraje.PUBLICO);
        Solar s1, s2, s3;
        s1 = new Solar("Gaira", 800, ZonaSolar.URBANO);
        s2 = new Solar("Los Alcaceres", 900, ZonaSolar.RUSTICO);
        s3 = new Solar("Minca", 700, ZonaSolar.RUSTICO);

        
        agencia.añadeVentaInmueble(s1);
        agencia.añadeVentaInmueble(s2);
        agencia.añadeVentaInmueble(s3);
        agencia.añadeVentaInmueble(v1);
        agencia.añadeVentaInmueble(v2);
        
        //agencia.añadeVentaInmueble(lc1);

        //------------------------------
        agencia.añadeAlquilerInmueble(lc1);
        agencia.añadeAlquilerInmueble(lc2);
        agencia.añadeAlquilerInmueble(lc3);
        agencia.añadeAlquilerInmueble(pg1);
        agencia.añadeAlquilerInmueble(pg2);
        
        

        //-------------------------------
        LinkedList<Inmueble> lista = (LinkedList<Inmueble>) agencia.inmueblesVenta(800000);
        System.out.println(".:INMUEBLES EN VENTA CUYO PRECIO ES MENOR A 800000:.");
        for (Inmueble inmueble : lista) {
            inmueble.muestra();
            System.out.println("\n------------\n");
        }

        //-------------------------------
        LinkedList<LocalComercial> locales = (LinkedList<LocalComercial>) agencia.localesSegundaMano(600);
        System.out.println(".:LOCALES COMERCIALES CUYA AREA ES MAYOR A 600 METROS CUADRADOS:.");
        for (LocalComercial local : locales) {
            local.muestra();
            System.out.println("\n------------\n");
        }

        //-------------------------------
        int numSolares = agencia.solaresRusticos();
        System.out.println("NUMERO DE SOLARES RUSTICOS EN VENTA: " + numSolares);
    }
}
