package tarea2;

class Expendedor {

    private int cantidad;
    private int precio;
    private int cualquiera;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Moneda Pago;

    public Expendedor(int numBebidas, int precioBebidas) {
        cantidad = numBebidas;
        precio = precioBebidas;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        for (int i = 0; i < cantidad; i++) {
            coca.addBebida(new CocaCola(i + 100));
            sprite.addBebida(new Sprite(i + 200));
            fanta.addBebida(new Fanta(i + 300));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        Pago = m;
        if (Pago.getValor() > precio) {
            cualquiera = Pago.getValor() - precio;
            switch (cual) {
                case 1:
                    return coca.getBebida();
                case 2:
                    return sprite.getBebida();
                case 3:
                    return fanta.getBebida();
                default:
                    return null;
            }
        } else {
            return null;
        }
    }

    public Moneda getVuelto() {
        if (cualquiera == 0) {
            Pago = null;
            return Pago;
        } else {
            cualquiera = cualquiera - 100;
            return (new Moneda100());
        }
    }

    public int vueltito() {
        int resp = Pago.getValor() - precio;
        return (resp);
    }

    public void ValidarBebida() {
        ControlExceptions h = new ControlExceptions();
        if (cantidad <= 0) {
            try {
                h.validarBebida();
            }
            catch(NoHayBebidaException b){
                System.out.println("Error: " + b.getMessage());
            }
        }
    }
}
