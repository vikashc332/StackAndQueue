import com.blz.linkedlist.INode;
import com.blz.linkedlist.LinkList;
import com.blz.linkedlist.MyNode;

public class Stack<K> {

    private final LinkList stackLinkedList;

    public Stack() {
        stackLinkedList = new LinkList();
    }


    public void push(INode element) {
        stackLinkedList.addNode((MyNode) element);
    }


    public INode peek() {
        return stackLinkedList.head;
    }


    public INode pop() {
        return stackLinkedList.head;
    }


    public boolean isEmpty() {
        if(stackLinkedList.head != null) {
            return false;
        }
        else {
            return true;
        }
    }


    public int size() {
        return stackLinkedList.hashCode();
    }


    public void printStack() {
        stackLinkedList.display();
    }
}
