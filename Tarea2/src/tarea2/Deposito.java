package tarea2;

import java.util.ArrayList;

class Deposito {

    private ArrayList gaseosa;

    public Deposito() {
        gaseosa = new ArrayList();
    }

    public void addBebida(Bebida num) {
        gaseosa.add(num);
    }

    public Bebida getBebida() {
        if (gaseosa.size() <= 0) {
            return null;
        } else {
            Bebida b = (Bebida) gaseosa.remove(0);
            return b;
        }
    }
}
