package Leccion3.tarea1;

import java.util.HashMap;
import java.util.Map;

public class ContenedorIoC {
	private Map<Class<?>, Object> beans = new HashMap<>();

    public void registrar(Class<?> clase, Object bean) {
        beans.put(clase, bean);
    }

    public <T> T obtener(Class<T> clase) {
        return (T) beans.get(clase);
    }
}