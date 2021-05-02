public class stackClass {
    myLinkedList list = new myLinkedList();
    public void push(int data){
        list.addInRecursive(data);
    }

    public void printStack() {
        list.show();
    }

    node Head;
    public void pop() {
        int count =0;
        while(true){
            if(list.Head == null) {
                System.out.println("stack is empty");
                break;  
            }
            node temp = list.Head;
            System.out.println(count++ + "element removed from stack");
            if(temp != null ) {
                list.Head = temp.next;
            }
        }
    }
}
