
public class Queue {
    QueueNode front = null, rear = null;
    int size = 0;

    public boolean isEmpty(){
        return front == null;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The Queue is empty!");
            return -1;
        }
        else return front.getData();
    }

    public void push(int val){
        QueueNode newNode = new QueueNode(val);
        if (front == null || rear == null){
            front = newNode;
            rear = newNode;
        }
        newNode.next = rear; size++;
        System.out.println("Successfully pushed " + val);
    }
    public int pop(){
        if(front == null) return -1;
        else {
            QueueNode temp = front;
            int poppedElement = temp.data;
            front = front.next;
            temp.next = null;
            return poppedElement;
        } 
    }
}
