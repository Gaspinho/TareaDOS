package tarea2;

abstract class Bebida {

    private int num;

    public Bebida(int NumSerie) {
        num = NumSerie;
    }

    public int getSerie() {
        return num;
    }

    public String beber() {
        return "Bebiendo: ";
    }
}

class Sprite extends Bebida {

    public Sprite(int s) {
        super(s);
    }

    public String beber() {
        return (super.beber() + "Sprite");
    }

}

class CocaCola extends Bebida {

    public CocaCola(int c) {
        super(c);
    }

    public String beber() {
        return super.beber() + "Cocacola";
    }
}

class Fanta extends Bebida {

    public Fanta(int d) {
        super(d);
    }

    public String beber() {
        return super.beber() + "Fanta";
    }
}
