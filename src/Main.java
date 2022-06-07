public class Main {

    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~STACK START~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        GStack<String> stack = new GStack<String>(10);

        stack.push("Dipanwita");
        stack.push("Niloy");
        stack.push("Kaushik");
        stack.printS();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        stack.pop();
        stack.printS();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        stack.push("Kaushik");
        stack.printS();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~STACK END~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("\n\n\n\n");


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~QUEUE START~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        GQueue<String> queue = new GQueue<String>(10);
        queue.enqueue("Kaushik");
        queue.enqueue("Dipanwita");
        queue.enqueue("Niloy");

        queue.printQ();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        queue.dequeue();
        queue.printQ();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        queue.enqueue("Kaushik");
        queue.printQ();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~QUEUE END~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }

}
