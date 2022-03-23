package banco;

class nodoCola {

    nodoCola next;
    nodoCola prev;
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
}



