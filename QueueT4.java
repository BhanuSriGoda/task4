// Java program to reverse a Queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Java program to reverse a queue ===that becomes stack 
public class QueueT4{

	static Queue<Integer> queue;
    static Stack<Integer> stack1;

	static void Print()
	{
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() + ", ");
			queue.remove();
		}
	}
 
    static void deletequeue()
    {
        Stack<Integer>stack1=new Stack<>();
        if(!queue.isEmpty())
        {
        
			queue.remove();
        }
    }

	
	static void reversequeue()
	{
		Stack<Integer> stack = new Stack<>();
		while (!queue.isEmpty()) {
			stack.add(queue.peek());
			queue.remove();
		}
		while (!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
		}
	}

	public static void main(String args[])
	{
		queue = new LinkedList<Integer>();
        Stack<Integer>stack1=new Stack<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
        System.out.println("inserted elements of the queue");
        System.out.print(queue);
        System.out.println("\ndeleted elements are");
        stack1.push(queue.peek());
        queue.remove();
        stack1.push(queue.peek());
        queue.remove();
       System.out.println(stack1);
       System.out.println("remaining element are:");
		reversequeue();
		Print();
	}
}

