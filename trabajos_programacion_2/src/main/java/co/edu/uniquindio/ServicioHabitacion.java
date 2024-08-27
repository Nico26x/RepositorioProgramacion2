package co.edu.uniquindio;

public class ServicioHabitacion extends Servicio {

    private final String serviciosEspecificos;

    public ServicioHabitacion(String spa, String restaurante, String limpieza, String serviciosEspecificos) {
        super(spa, restaurante, limpieza);
        this.serviciosEspecificos = serviciosEspecificos;
    }

    public String getServiciosEspecificos() {
        return serviciosEspecificos;
    }

}
