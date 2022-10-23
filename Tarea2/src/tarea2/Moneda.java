package tarea2;

abstract class Moneda {

    public int valor;

    public Moneda() {
        super();
    }

    public String getSerie() {
        return "Moneda de ";
    }

    public int getValor() {
        return valor;
    }
}

class Moneda1500 extends Moneda {

    public Moneda1500() {
        super();
    }

    public String getSerie() {
        return super.getSerie() + "1500";
    }

    public int getValor() {
        valor = 1500;
        return super.getValor();
    }
}

class Moneda1000 extends Moneda {

    public Moneda1000() {
        super();
    }

    public String getSerie() {
        return super.getSerie() + "1000";
    }

    public int getValor() {
        valor = 1000;
        return super.getValor();
    }
}

class Moneda500 extends Moneda {

    public Moneda500() {
        super();
    }

    public String getSerie() {
        return super.getSerie() + "500";
    }

    public int getValor() {
        valor = 500;
        return super.getValor();
    }

}

class Moneda100 extends Moneda {

    public Moneda100() {
        super();
    }

    public String getSerie() {
        return super.getSerie() + "100";
    }

    public int getValor() {
        valor = 100;
        return super.getValor();
    }

}
