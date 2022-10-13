
package tarea2;

import java.util.ArrayList;


public class Tarea2 {

    public static void main(String[] args) {
        
    }
    
}
class Comprador{
    
    private int cuantos;
    private String qtomaste;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida aux=exp.comprarBebida(m,cualBebida);
        qtomaste=aux.beber();
        cuantos=exp.vueltito();
    }
    public int cuantoVuelto(){
        return(cuantos);
    }
    public String queBebiste(){
        return(qtomaste);
    }
    
}
class Expendedor{
    private int cant;
    private int prezio;
    private int cualkier;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Moneda Pago;
    
    public Expendedor(int numBebidas, int precioBebidas){
        cant=numBebidas;
        prezio=precioBebidas;
        coca=new Deposito();
        sprite=new Deposito();
        fanta=new Deposito();
        for (int i = 0; i < cant; i++) {
            coca.addBebida(new CocaCola(i+100));
            sprite.addBebida(new Sprite(i+200));
            fanta.addBebida(new Fanta(i+300));
            }
    }
    public Bebida comprarBebida(Moneda m, int cual){
        Pago=m;
        if(Pago.getValor()>prezio){
            cualkier=prezio-Pago.getValor();
            switch(cual){
                case 1: return coca.getBebida();
                case 2: return sprite.getBebida();
                case 3: return fanta.getBebida();
                default: return null;
            }
        }else{
            return null;
        }
    }
    public Moneda getVuelto(){
        if(cualkier==0){
            Pago=null;
            return Pago;
        }
        else{
         cualkier=cualkier-100;
         return(new Moneda100());
         }
    }
    public int vueltito(){
        int resp=prezio-Pago.getValor();
        return(resp); 
   }
} 
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
            Bebida b = (Bebida)gaseosa.remove(0);
            return b;
        }
    }
}
abstract class Bebida{
    
    private int num;
    
    public Bebida(int NumSerie){
        num=NumSerie;
    }
    public int getSerie(){
        return num;
    }
    public String beber(){
        return "bebiendo:";
    }
}
class Sprite extends Bebida{
    
    public Sprite(int s){
        super(s);
    }
    public String beber(){
        return(super.beber()+"Sprite");
    }
    
}
class CocaCola extends Bebida{
    public CocaCola(int c){
        super(c);
    }
    public String beber(){
        return super.beber()+"Cocacola";
    }   
}
class Fanta extends Bebida{
    public Fanta(int d){
        super(d);
    }
    public String beber(){
        return super.beber()+"Fanta";
    }   
}
abstract class Moneda{
    public int valor;
    public Moneda(){
       super();
    }
    public String getSerie(){
        return "moneda de ";
    }
    public int getValor(){
        return valor;
    }
}
class Moneda1500 extends Moneda{
    public Moneda1500(){
        super();
    }
    public String getSerie(){
        return super.getSerie()+"1500";
    }
    public int getValor(){
        valor=1500;
        return super.getValor();
    }
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public String getSerie(){
        return super.getSerie()+"1000";
    }
    public int getValor(){
        valor=1000;
        return super.getValor();
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    public String getSerie(){
        return super.getSerie()+"500";
    }
    public int getValor(){
        valor=500;
        return super.getValor();
    }

}
class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public String getSerie(){
        return super.getSerie()+"100";
    }
    public int getValor(){
        valor=100;
        return super.getValor();
    }
    
}

