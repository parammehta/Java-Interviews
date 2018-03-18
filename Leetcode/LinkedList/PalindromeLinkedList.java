package LinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        PalindromeLinkedList list = new PalindromeLinkedList();
        int[] data1 = {1, 2, 4, 2, 1};
        ListNode head1 = new ListNode(data1[0]);

        for (int count = 1; count < data1.length; count++)
            list.insert(head1, data1[count]);

        System.out.printf("Linked list 1 is : ");
        list.print(head1);

        System.out.println(list.isPalindrome(head1));
    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public void insert(ListNode head, int val) {
        while (head.next != null)
            head = head.next;
        head.next = new ListNode(val);
    }

    public void print(ListNode head) {
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
