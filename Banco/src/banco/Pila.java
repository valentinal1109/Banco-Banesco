package banco;

class nodo {

    nodo next;
    Cliente persona;

}

public class Pila {

    nodo top = null;

    void push(nodo nuevo) {
        if (this.isEmpty()) {
            top = nuevo;
        } else {
            nuevo.next = top;
            top = nuevo;
        }
    }

    nodo pop() {
        nodo temp = top;
        top = top.next;
        temp.next = null;
        return temp;
    }

    boolean isEmpty() {
        return top == null;
    }

    void printPila() {
        while (!isEmpty()) {
            System.out.println(pop().persona);
        }
    }

    Cliente peek() {
        if (!this.isEmpty()) {
            return top.persona;
        } else {
            return null;
        }

    }

}

