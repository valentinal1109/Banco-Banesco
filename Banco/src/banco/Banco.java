package banco;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class Banco {

    public static void main(String[] args) {

        try {      // Leer archivo //

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valentina\\Documents\\NetBeansProjects\\Banco\\Clientes.in"));

            {
            }
            String linea;
            while ((linea = br.readLine()) != null) { // Separar datos archivo //

                linea.split(",");
                String[] datos = linea.split(",");

                int cantidad_retiro = 0;
                int cantidad_ActLibreta = 0;
                int cantidad_consulta = 0;
                int cantidad_deposito = 0;
                int cantidad_pago = 0;
                String nombre_cliente;
                String edad_cliente;
                String preferencial_cliente;

                for (int i = 0; i < datos.length; i++) {                        // Ciclo que recorre String y almacena los tres primeros datos//

                    nombre_cliente = datos[0];
                    edad_cliente = datos[1];
                    preferencial_cliente = datos[2];

                    if (i >= 3 && i < 8) {                                     // Ciclo para guardar y sumar transacciones 

                        if (datos[i].equals("retiro")) {

                            String retiro_cliente = datos[i];
                            cantidad_retiro++;

                        }
                        if (datos[i].equals("ActLibreta")) {

                            String ActLibreta_cliente = datos[i];
                            cantidad_ActLibreta++;

                        }
                        if (datos[i].equals("consulta")) {

                            String consulta_cliente = datos[i];
                            cantidad_consulta++;

                        }

                        if (datos[i].equals("deposito")) {

                            String deposito_cliente = datos[i];
                            cantidad_deposito++;

                        }

                        if (datos[i].equals("pago")) {

                            String pago_cliente = datos[i];
                            cantidad_pago++;

                        }

                    }

                }

            }

        } catch (IOException e) {

            System.out.println("Error E/S: " + e);

        }

    }

}
