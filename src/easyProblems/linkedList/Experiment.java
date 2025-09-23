package easyProblems.linkedList;

class ListNode{
    int data;
    ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class Experiment {
    public static void main(String[] args) {
        ListNode node = new ListNode(10);
        node.next = new ListNode(20);

        ListNode obj1 = node.next;

        System.out.println(node.data+" data and next reference is = "+obj1.data);
    }
}
