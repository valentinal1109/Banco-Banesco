package banco;

import java.io.IOException;

public class Cliente {

    String nombre, edad, preferencial, retiro, deposito, consulta, ActLibreta, pago;

    boolean isPreferencial() {

        while (preferencial != null) {

            if (preferencial.equals("true")) {

                return true;

            }
            if (preferencial.equals("false")) {

                return false;

            }

            if (!"true".equals(preferencial) && !"false".equals(preferencial)) {

                throw new IllegalArgumentException(" valor preferencial invalido , introducir true or false");

            }
        }
        return isPreferencial();
    }

}
