
import com.blz.linkedlist.INode;
import com.blz.linkedlist.LinkList;
import com.blz.linkedlist.MyNode;

public class Queue<K> {

    private final LinkList queueLinkedList = new LinkList();

    public void enqueue(INode element) {
        queueLinkedList.append((MyNode) element);
    }
    public INode dequeue() {
        return queueLinkedList.head;
    }


    public boolean isEmpty() {
        if(queueLinkedList.head != null) {
            return false;
        }
        else {
            return true;
        }
    }

    public int size() {
        return queueLinkedList.hashCode();
    }

    public void printQueue() {
        queueLinkedList.display();
    }
}
