package Leccion3.tarea1;

public class Main {
	public static void main(String[] args) {
		ContenedorIoC contenedor = new ContenedorIoC();

        // Registrar la implementación del servicio
        contenedor.registrar(Servicio.class, new ServicioImplementacion());

        // Inyectar la dependencia del servicio en una clase que lo necesita
        ClaseDependiente claseDependiente = new ClaseDependiente(contenedor.obtener(Servicio.class));

        // Ejecutar la operación de la clase dependiente
        claseDependiente.ejecutar();
    }
}