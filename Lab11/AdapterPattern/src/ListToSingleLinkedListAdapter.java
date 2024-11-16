import java.util.LinkedList;
import java.util.List;

public class ListToSingleLinkedListAdapter implements SingleLinkedList {

    private final List<Integer> list;

    public ListToSingleLinkedListAdapter() {
        this.list = new LinkedList<>();
    }

    @Override
    public void addNode(int value) {
        list.add(value);
    }

    @Override
    public void delNode(int value) {
        list.remove(Integer.valueOf(value));
    }

    @Override
    public void print() {
        System.out.println("Single Linked List: " + list);
    }

    @Override
    public int countNodes() {
        return list.size();
    }
}
