
class ListNode{
    int data;
    ListNode next;
    ListNode(){}
    ListNode(int data){
        this.data = data;
    }
}
public class OddEvenLinkedList_Amazon {
    public static void main(String[] args) {
        OddEvenLinkedList_Amazon object = new OddEvenLinkedList_Amazon();
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(8);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(10);
        ListNode node7 = new ListNode(11);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        object.show(object.oddEvenNode_BestMethod(head));

    }

    public ListNode oddEvenNode_BestMethod(ListNode head){
        if(head == null)
            return null;
        else if(head.next == null || head.next.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public void show(ListNode head){
        while(head != null) {
            System.out.print(head.data);
            if(head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
    }
}
