package banco;

class nodo {

    nodo next;
    nodo prev;
    Cliente persona;

}

public class Cola {

    nodo front;
    nodo rear;
    int size = 0;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(nodo incoming) {
        if (this.isEmpty()) {
            this.front = incoming;
            this.rear = incoming;
        } else {
            this.rear.next = incoming;
            this.rear = this.rear.next;
        }
        this.size++;
    }

    nodo dequeue() {
        if (!this.isEmpty()) {
            nodo temp = this.front;
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
}



