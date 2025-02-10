public class QueueNode{
    public int data;
    public QueueNode next;

    public QueueNode(int data){
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return data;
    }

    public QueueNode getNext(){
        return next;
    }
}