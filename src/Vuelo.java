import java.util.Date;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date momentoLlegada;
    private Integer cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date momentoLlegada, Integer cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.momentoLlegada = momentoLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getMomentoLlegada() {
        return momentoLlegada;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo: " + "nombre=" + nombre + ", origen=" + origen + ", destino=" + destino + ", momentoLlegada=" + momentoLlegada + ", numeroPasajeros=" + cantidadPasajeros;
    }
}
