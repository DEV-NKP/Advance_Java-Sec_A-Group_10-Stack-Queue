public class GQueue<T> {


    int front = 0;
    int rear = 0;
    int size = -1;


    private T[] data;

    public GQueue(int size) {
        this.data = (T[]) new Object[size];
        this.size = size;
    }

    void enqueue(T t) {
        if (size == rear) {
            System.out.printf("Queue is full");
            return;
        } else {
            data[rear] = t;
            rear++;
        }
        return;
    }

    void dequeue() {

        if (this.empty()) {
            System.out.println("Queue is already empty");

        } else {


            for (int i = 0; i < rear - 1; i++) {
                data[i] = data[i + 1];
            }


            if (rear < size) {
                data[rear - 1] = null;
            }

            rear--;


        }
    }

    boolean empty() {

        if (front == -1 && rear == -1)
            return true;
        else {
            return false;
        }
    }

    public void printQ() {
        for (int i = 0; i < rear; i++) {
            System.out.println(data[i]);
        }

    }

}
