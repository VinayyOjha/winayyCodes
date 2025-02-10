
public class MainQ {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.pop();
        q.push(23);
        q.push(123);
        q.pop();
        q.push(34);        
        q.pop();
        q.pop();
        q.push(88);        
        q.pop();
        // q.push(7);
    }
}


// class Queue {
//     QueueNode front = null, rear = null;
//     int size = 0;

//     public boolean isEmpty(){
//         return front == null;
//     }

//     public int peek(){
//         if (isEmpty()){
//             System.out.println("The Queue is empty!");
//             return -1;
//         }
//         else return front.getData();
//     }

//     public void push(int val){
//         QueueNode newNode = new QueueNode(val);
//         if (front == null || rear == null){
//             front = newNode;
//             rear = newNode;
//         }
//         newNode.next = rear; size++;
//         System.out.println(val);
//     }
//     public void pop(){
//         if(front == null) System.out.println("-1");
//         else {
//             QueueNode temp = front;
//             int poppedElement = temp.data;
//             front = front.next;
//             if (front == null) rear = null;
//             temp.next = null;
//             System.out.println("Popped element: " + poppedElement);
//         } 
//     }
// }

// class QueueNode{
//     public int data;
//     public QueueNode next;

//     public QueueNode(int data){
//         this.data = data;
//         this.next = null;
//     }

//     public int getData(){
//         return data;
//     }

//     public QueueNode getNext(){
//         return next;
//     }
// }