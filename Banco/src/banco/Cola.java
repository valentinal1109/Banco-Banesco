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

    void dequeuePreferencial(nodoCola actual) {

        Cola cola_temp = new Cola();
        nodoCola temporal ;
        nodoCola preferencial ;
        int contador_comunes = 4;
        
        while (!this.isEmpty()) {
            
            if (actual.p.isPreferencial()) {
                
                nodoCola temp = actual;
                this.dequeue();
                System.out.println(" atendido prefrenecial: " + temp.p.nombre );
                
                
            }else{
            
            temporal = this.dequeue();
            cola_temp.enqueue(temporal);
 
            
            
            
           
            
            }    
            
            //    for (int i =0; i <= contador_comunes ; i++){
                
            //    actual = this.dequeue();
            //    nodoCola temporal_alma = nodo_temporalalmacenamain;

            //    for (int a = 0; a <= cola_temp.size; a++) {
                    
            //        this.enqueue(cola_temp.rear);
                   
            //    }
            //     this.front = cola_temp.front;
            //    System.out.println(" valor prefrencial " + temporal_alma.p.nombre);
            //    System.out.println(" cola final " + cola_temp.front.p.nombre);
            }

        }
        
  
        

        
        
        

        //  if (temporal.p.isPreferencial()){
        //  temporal = this.dequeue()
    }



/*  void dequeuePreferencial(nodoCola actual) {
        
        Cola temp = new Cola();  
        nodoCola temporal;
        while (!this.isEmpty()){
        

            temporal = this.dequeue();
            
            if (!temporal.p.isPreferencial()){
                
                temp.enqueue(temporal);
                System.out.print(" cola temporal" +temp.front.p.nombre);
 
             
            } else
                System.out.println(" viejito encintrado ");
                
            
                
                
        
        
        }*/
//   nodoCola tempo = new nodoCola();
//  actual = this.dequeue();
// tempo = actual ;
//   temporal.enqueue(tempo);
//  System.out.println(" n " + actual.p.nombre);
//  System.out.println(" cola temporal " +temporal.front );

