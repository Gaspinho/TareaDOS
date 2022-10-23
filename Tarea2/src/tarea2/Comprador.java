package tarea2;

class Comprador {

    private int cantidad;
    private String tipoBebida;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida aux = exp.comprarBebida(m, cualBebida);
        ControlExceptions h = new ControlExceptions();
        if (aux == null) {
            cantidad = m.getValor();
            try {
                h.validarBebida();
            } catch (NoHayBebidaException b) {
                System.out.println("Error: " + b.getMessage());
            }
        } else {
            tipoBebida = aux.beber();
            cantidad = exp.vueltito();
        }

    }

    public int cuantoVuelto() {
        return (cantidad);
    }

    public String queBebiste() {
        return (tipoBebida);
    }

}
