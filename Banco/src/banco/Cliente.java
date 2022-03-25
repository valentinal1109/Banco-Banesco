package banco;

public class Cliente {

    String nombre, edad, preferencial, retiro, deposito, consulta, ActLibreta, pago;
    int TiempoTramites;

    boolean isPreferencial() {
        return preferencial.equals("true");
    }

}
