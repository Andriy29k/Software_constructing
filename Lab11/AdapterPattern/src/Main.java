
public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleList = new ListToSingleLinkedListAdapter();

        singleList.addNode(10);
        singleList.addNode(20);
        singleList.addNode(30);
        singleList.print();

        singleList.delNode(20);
        singleList.print();

        System.out.println("Total nodes: " + singleList.countNodes());
    }
}