import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~STACK START~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of element: ");
        int n=input.nextInt();
        GStack<Integer> stack = new GStack<Integer>(n);
        System.out.println("Enter elements: ");
  for(int i =0 ; i<n; i++)
  {
      int element=input.nextInt();
      stack.push(element);
  }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Print all Elements: ");
        stack.printS();
        stack.pop();
        System.out.println("After pop: ");
        stack.printS();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~STACK END~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("\n\n\n\n");


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~QUEUE START~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Enter number of element: ");
        int n1=input.nextInt();
        GQueue<Integer> queue = new GQueue<Integer>(n1);
        System.out.println("Enter elements: ");
        for(int i =0 ; i<n1; i++)
        {
            int element=input.nextInt();
            queue.enqueue(element);
        }

        System.out.println("Print all Elements: ");
        queue.printQ();
        queue.dequeue();
        System.out.println("After Dequeue: ");
        queue.printQ();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~QUEUE END~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }

}
