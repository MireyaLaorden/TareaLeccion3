package Leccion3.tarea1;

public class ClaseDependiente {
	private Servicio servicio;

    public ClaseDependiente(Servicio servicio) {
        this.servicio = servicio;
    }

    public void ejecutar() {
        servicio.ejecutar();
    }
}