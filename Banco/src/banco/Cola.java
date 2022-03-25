package banco;

class nodoCola {

    nodoCola next;
    Cliente p;

}

public class Cola {

    nodoCola front;
    nodoCola rear;
    int size = 0;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(nodoCola incoming) {
        if (this.isEmpty()) {
            this.front = incoming;
            this.rear = incoming;
        } else {
            this.rear.next = incoming;
            this.rear = this.rear.next;
        }
        this.size++;
    }

    nodoCola dequeue() {
        if (!this.isEmpty()) {
            nodoCola temp = this.front;
            this.front = this.front.next;
            temp.next = null;
            if (this.isEmpty()) {
                this.rear = null;
            }
            this.size--;
            return temp;
        } else {
            System.out.println("Cola Vacia");
            return null;
        }
    }

    void printCola() {

        while (!this.isEmpty()) {
            System.out.println((this.dequeue()).p.nombre + " ..");
        }

    }

    boolean PreferencialDesencolado() {

       if (this.front.p.isPreferencial()) {

       }
       return true; 
    }

    void dequeuePreferencial(nodoCola actual) {

         Cola auxiliar = new Cola();
         Cola impresion = new Cola();


        nodoCola temporal = new nodoCola();
        nodoCola temp = actual;
        boolean viejoMedio;

        while (!this.isEmpty()) {
                     nodoCola impres ;

            if (actual.p.isPreferencial()) {

                temp = actual;
 
                this.dequeue();

               //impresion.enqueue(impres);
              //  impresion.printCola();
                
                
                if (viejoMedio = true){
                
                 for (int i =0 ; i < 4 ; i++){
                 
                   this.dequeue();
                 // impresion.enqueue(impres);
               //   impresion.printCola();
                 }
               // System.out.println(" 1");
                viejoMedio = false;
                }
                
             //   System.out.println("Salio prefernecial " + temp.p.nombre);

            } else {

                temporal = this.dequeue();
                auxiliar.enqueue(temporal);
                viejoMedio = true;
                
            }
            
            
            if (!auxiliar.isEmpty()) {

                this.front = auxiliar.rear ;
                System.out.println(" front " + this.front.p.nombre);
                this.dequeue();
     

            }

            
            
            if ( this.isEmpty()&& !auxiliar.isEmpty()){
                
                    auxiliar.dequeue(); 
                     auxiliar.dequeue();
                   // impresion.enqueue(impres);
        }
            
          
        }
      
       // while (!impresion.isEmpty()){
        
        //System.out.println(" cola impresion: " +impresion.dequeue().p.nombre);
        
        
        }
        
    }





