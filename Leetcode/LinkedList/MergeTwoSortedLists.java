package LinkedList;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        int[] data1 = {1, 2, 4};
        ListNode head1 = new ListNode(data1[0]);
        for (int count = 1; count < data1.length; count++)
            insert(head1, data1[count]);

        System.out.printf("Linked list 1 is : ");
        print(head1);

        int[] data2 = {1, 3, 4};
        ListNode head2 = new ListNode(data2[0]);
        for (int count = 1; count < data2.length; count++)
            insert(head2, data2[count]);

        System.out.printf("Linked list 2 is : ");
        print(head2);

        ListNode mergedList = mergeTwoLists(head1, head2);
        System.out.printf("Merged Linked list is : ");
        print(mergedList);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

    public static void insert(ListNode head, int data) {
        while (head.next != null)
            head = head.next;
        head.next = new ListNode(data);
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.printf("%d ", head.val);
            head = head.next;
        }
        System.out.println("");
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
