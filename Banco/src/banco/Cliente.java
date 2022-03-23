package banco;

public class Cliente {

    String nombre , edad, preferencial , retiro , deposito, consulta , ActLibreta , pago;
    boolean preferecnial;
 

    public Cliente(String nom, String  ed, boolean bol, String  reti, String  depo, String  consul, String  al, String  pa) {
        this.nombre = nom;
        this.edad = ed;
        this.preferecnial = bol;
        this.retiro = reti;
        this.deposito = depo;
        this.consulta = consul;
        this.ActLibreta = al;
        this.pago = pa;

    }

}
