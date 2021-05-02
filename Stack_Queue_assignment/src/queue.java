public class queue {
    myLinkedList list = new myLinkedList();
    public void enqueue(int data){
        list.add(data);
    }

    public void printQueue() {
        list.show();
    }

    node Head;
    public void deque() {
        int count =0;
        while(true){
            if(list.Head == null) {
                System.out.println("queue is empty");
                break;  
            }
            node temp = list.Head;
            System.out.println(count++ + "element removed from queue");
            if(temp != null ) {
                list.Head = temp.next;
            }
        }
    }
}

