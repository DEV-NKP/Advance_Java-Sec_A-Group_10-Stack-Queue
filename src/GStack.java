
public class GStack<T> {
    private T[] data;
    private int stackTop = -1;

    public GStack(int size) {
        this.data = (T[]) new Object[size];
    }

    public void push(T t) {
        if (isFull()) {
            System.out.println("Stack is Full .");
        } else {
            data[++stackTop] = t;
            //   System.out.println("added"+t);
        }
    }

    public boolean pop() {
        if (isEmpty()) {
            System.out.println("Stack Have no data ");
            return false;
        } else {
            T pops = data[stackTop];
            data[stackTop] = null;
            stackTop--;
            return true;
        }
    }


    public boolean isEmpty() {

        if (stackTop == -1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull() {

        if (stackTop + 1 == data.length) {
            return true;
        } else {
            return false;
        }

    }

    public void printS() {
        for (int i = 0; i < stackTop + 1; i++) {
            System.out.println(data[i]);
        }

    }


}
