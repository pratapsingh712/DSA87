package easyProblems.linkedList;

class Node {
    int data;
    Node next;

    public Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class CycleInLInkedList {
    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);

        node.next.next.next = node.next;

        boolean has_Cycle = cycleDetected(node);

        System.out.println("Cycle detected in the linked list: "+has_Cycle);

    }

    public static boolean cycleDetected(Node node) {

        if(node==null || node.next==null){
            return false;
        }

        Node first = node, second = node;

        do{
            first = first.next;
            second = second.next.next;

            if(first==second){
                return true;
            }
        }while(first!=null && second!=null && second.next!=null);

        return false;
    }
}
