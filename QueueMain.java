
public class QueueMain {
    public static void main(String[] args) {

        System.out.println("----- Welcome To Data Structure : Queue -----");

        Queue queueList = new Queue();
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        queueList.enqueue(firstNode);
        queueList.enqueue(secondNode);
        queueList.enqueue(thirdNode);
        queueList.printQueue();

        System.out.println("Size of the Queue is: " + queueList.size());
        System.out.println("Queue after repeated dequeue : ");
        while (!queueList.isEmpty()) {
            queueList.dequeue();
            break;
        }
        queueList.printQueue();
    }
}
