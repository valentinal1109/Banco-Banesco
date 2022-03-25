package banco;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Iterator;

public class Banco {

    public static void main(String[] args) {

        int cantidad_retiro = 0;
        int cantidad_ActLibreta = 0;
        int cantidad_consulta = 0;
        int cantidad_deposito = 0;
        int cantidad_pago = 0;
        // -----  cantidad ------------////
        int segundos_retiro = 0;
        int segundos_ActLibreta = 0;
        int segundos_consulta = 0;
        int segundos_deposito = 0;
        int segundos_pago = 0;
        int segundosTotales = 0;

        ///------ segundos --------------//    
        String nombre_cliente;
        String edad_cliente;
        String preferencial_cliente;
        //------datos string ----------------//

        Cola clientela = new Cola();
        ///-----  cola - nodo cola --------//    
        nodoPila a = new nodoPila();
        Pila Atendidos = new Pila();
        ///----- pila - nodo pila -------//

        try {      // Leer archivo //

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valentina\\Documents\\GitHub\\Banco-Banesco\\Banco\\Clientes.in"));

            {
            }
            String linea;
            while ((linea = br.readLine()) != null) {                   // Separar datos archivo //

                linea.split(",");
                String[] datos = linea.split(",");
                Cliente persona = new Cliente();
                nodoCola n = new nodoCola();

                for (int i = 0; i < datos.length; i++) {                 // Ciclo que recorre String y almacena los tres primeros datos//

                    nombre_cliente = datos[0];
                    edad_cliente = datos[1];
                    preferencial_cliente = datos[2];

                    persona.nombre = nombre_cliente;
                    persona.edad = edad_cliente;
                    persona.preferencial = preferencial_cliente;
                    persona.isPreferencial();

                    if (i >= 3 && i < 8) {                                // Ciclo para guardar , sumar transacciones y asignar datos al objeto cliente

                        if (datos[i].equals("retiro")) {

                            String retiro_cliente = datos[i];
                            cantidad_retiro++;
                            segundos_retiro = cantidad_retiro * 240;
                            persona.retiro = retiro_cliente + " " + "(" + cantidad_retiro + ")" + " " + segundos_retiro + " sg" + " - ";

                        }
                        if (datos[i].equals("ActLibreta")) {

                            String ActLibreta_cliente = datos[i];
                            cantidad_ActLibreta++;
                            segundos_ActLibreta = cantidad_ActLibreta * 300;
                            persona.ActLibreta = ActLibreta_cliente + "  " + "(" + cantidad_ActLibreta + ")" + "  " + segundos_ActLibreta + " sg" + " - ";
                        }
                        if (datos[i].equals("consulta")) {

                            String consulta_cliente = datos[i];
                            cantidad_consulta++;
                            segundos_consulta = cantidad_consulta * 90;
                            persona.consulta = consulta_cliente + "  " + "(" + cantidad_consulta + ")" + "  " + segundos_consulta + " sg" + " - ";
                        }

                        if (datos[i].equals("deposito")) {

                            String deposito_cliente = datos[i];
                            cantidad_deposito++;
                            segundos_deposito = cantidad_deposito * 180;
                            persona.deposito = deposito_cliente + "  " + "(" + cantidad_deposito + ")" + "  " + segundos_deposito + " sg" + " - ";
                        }

                        if (datos[i].equals("pago")) {

                            String pago_cliente = datos[i];
                            cantidad_pago++;
                            segundos_pago = cantidad_pago * 120;
                            persona.pago = pago_cliente + "  " + "(" + cantidad_pago + ")" + "  " + segundos_pago + " sg" + " - ";
                        }

                        persona.TiempoTramites = segundos_retiro + segundos_ActLibreta + segundos_consulta + segundos_deposito + segundos_pago;
                    }

                }

                n.p = persona;

                clientela.enqueue(n);        //Creacion cola clientela con cada persona registrada


                persona.consulta = "";
                persona.ActLibreta = "";
                persona.deposito = "";
                persona.retiro = "";
                persona.pago = "";
                segundos_retiro = 0;
                segundos_ActLibreta = 0;
                segundos_consulta = 0;
                segundos_deposito = 0;
                segundos_pago = 0;
                cantidad_retiro = 0;
                cantidad_ActLibreta = 0;
                cantidad_consulta = 0;
                cantidad_deposito = 0;
                cantidad_pago = 0;

                segundosTotales += n.p.TiempoTramites;

              while (!clientela.isEmpty()) {
                  
                  if (segundosTotales  <= 27000){
                  
                       System.out.println ("--------------------------");
                        clientela.dequeuePreferencial(n);
                       // System.out.println(" atendidos" + n.p.nombre);
                       // System.out.println(" Total " + segundosTotales);
                  
                
                              
                  
                  
                  
                  }
                        

                        
                  }

                   /* do {

                        //  System.out.println(" Total " + segundosTotales);


                    } while (segundosTotales <= 27000);

                    // } else {
                    //        n = clientela.dequeue();
                    //System.out.println("....." + n.p.nombre + " "+ n.p.preferencial);
                */

            }

        } catch (IOException e) {

            System.out.println("Error E/S: " + e);

        }

    }

}

