public class Main {
    public static void main(String args[]) {
        System.out.println("this is stack portion"+ "  ");
        stackClass stack = new stackClass();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        
        stack.printStack();
        System.out.println(" ");

        stack.pop();

        System.out.println("this is queue portion"+ "  ");
        queue q = new queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);

        q.printQueue();
        System.out.println(" ");

        q.deque();

    }
    
}
