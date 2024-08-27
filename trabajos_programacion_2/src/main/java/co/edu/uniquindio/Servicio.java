package co.edu.uniquindio;

public class Servicio {

    private final String spa;
    private final String restaurante;
    private final String limpieza;
    
    public Servicio(String spa, String restaurante, String limpieza) {
        this.spa = spa;
        this.restaurante = restaurante;
        this.limpieza = limpieza;
    }

    public String getSpa() {
        return spa;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public String getLimpieza() {
        return limpieza;
    }

}
