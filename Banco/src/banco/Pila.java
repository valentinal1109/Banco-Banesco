package banco;

class nodoPila {

    nodoPila next;
    Cliente p;

}

public class Pila {

    nodoPila top = null;

    void push(nodoPila nuevo) {
        if (this.isEmpty()) {
            top = nuevo;
        } else {
            nuevo.next = top;
            top = nuevo;
        }
    }

    nodoPila pop() {
        nodoPila temp = top;
        top = top.next;
        temp.next = null;
        return temp;
    }

    boolean isEmpty() {
        return top == null;
    }

    void printPila() {
        while (!isEmpty()) {
            System.out.println(pop().p);
        }
    }

    Cliente peek() {
        if (!this.isEmpty()) {
            return top.p;
        } else {
            return null;
        }

    }

}

