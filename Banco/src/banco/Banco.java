package banco;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class Banco {

    public static void main(String[] args) {

        Cliente persona = new Cliente();

        try {      // Leer archivo //

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valentina\\Documents\\GitHub\\Banco-Banesco\\Banco\\Clientes.in"));

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

                    persona.nombre = nombre_cliente;
                    persona.edad = edad_cliente;
                    persona.preferencial = preferencial_cliente;
                    persona.isPreferencial();

                    if (i >= 3 && i < 8) {                                     // Ciclo para guardar , sumar transacciones y asignar datos al objeto cliente

                        if (datos[i].equals("retiro")) {

                            String retiro_cliente = datos[i];
                            cantidad_retiro++;
                            persona.retiro = retiro_cliente + "  " + cantidad_retiro;

                        }
                        if (datos[i].equals("ActLibreta")) {

                            String ActLibreta_cliente = datos[i];
                            cantidad_ActLibreta++;
                            persona.ActLibreta = ActLibreta_cliente + "  " + cantidad_ActLibreta;
                        }
                        if (datos[i].equals("consulta")) {

                            String consulta_cliente = datos[i];
                            cantidad_consulta++;
                            persona.consulta = consulta_cliente + "  " + cantidad_consulta;
                        }

                        if (datos[i].equals("deposito")) {

                            String deposito_cliente = datos[i];
                            cantidad_deposito++;
                            persona.deposito = deposito_cliente + "  " + cantidad_deposito;
                        }

                        if (datos[i].equals("pago")) {

                            String pago_cliente = datos[i];
                            cantidad_pago++;
                            persona.pago = pago_cliente + "  " + cantidad_pago;
                        }

                    }

                }

                nodoCola n = new nodoCola();
                Cola clientela = new Cola();                                    // Creacion cola clientela con cada persona registrada

                n.p = persona;

                clientela.enqueue(n);
                System.out.println("Cola: " + n.p.nombre + " " + n.p.edad + " " + n.p.preferencial + " " + n.p.consulta + " " + n.p.ActLibreta + " " + n.p.deposito + " " + n.p.retiro + " " + n.p.pago + " ");

                persona.consulta = "";
                persona.ActLibreta = "";
                persona.deposito = "";
                persona.retiro = "";
                persona.pago = "";
                     
                
                
                
                
                
                
                
                
            }

        } catch (IOException e) {

            System.out.println("Error E/S: " + e);

        }

    }

}
