package tarea2;

public class ControlExceptions {

    public ControlExceptions() {

    }

    public void validarBebida() throws NoHayBebidaException {
        throw new NoHayBebidaException("No hay bebidas disponibles");

    }
}
