public class LinkedListAdd2Lists {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode n2 = new ListNode(2,head);
        ListNode n3 = new ListNode(1,n2);


        ListNode head2 = new ListNode(4);
        ListNode n4 = new ListNode(3,head2);
        ListNode n5 = new ListNode(1,n4);

        LinkedListAdd2Lists object = new LinkedListAdd2Lists();
        ListNode result = object.mergeTwoLists(n3,n5);

        System.out.print("First Linked List: ");
        object.show(n3);
        System.out.print("\nSecond Linked List: ");
        object.show(n5);
        System.out.print("\nResult: ");
        object.show(result);


    }
    public void show(ListNode node){
        while(node != null) {
            System.out.print(node.data);
            if(node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode((list1.data < list2.data)?list1.data:list2.data);
        if(list1.data < list2.data)
            list1 = list1.next;
        else
            list2 = list2.next;

        ListNode result = node;
        while (true) {
            if(list1 == null){
                node.next = list2;
                break;
            }
            else if(list2 == null){
                node.next = list1;
                break;
            }
            if (list1.data < list2.data) {
                    node.next = new ListNode(list1.data);
                    node = node.next;
                    list1 = list1.next;
            }
            else {
                    node.next = new ListNode(list2.data);
                    node = node.next;
                    list2 = list2.next;
            }
        }
        return result;
    }
}


