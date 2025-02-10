package Ac;
// Find the output of the signly linkedlist
// NOTE* : I) Return NULL if the list is NULL
//         II) Just modify the input list
//         III) First 2 nodes values will remain unchanged

import java.util.Scanner;

public class Slinkedlist {

    static class StructNode {
        int val;
        StructNode next;
        StructNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

//---------------------------------------------------------------------------------------------------------------
    //main part
    public static StructNode addAlternateNodes(StructNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        int A = head.val;
        int B = head.next.val;
        StructNode temp = head.next.next;

        while (temp != null) {
            int current = temp.val;
            temp.val += A;
            A = B;
            B = current;
            temp = temp.next;
        }

        return head;
    }
//----------------------------------------------------------------------------------------------------------------

    public static void printList(StructNode head) {
        StructNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static StructNode createListFromInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return null;

        StructNode head = new StructNode(sc.nextInt());
        StructNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new StructNode(sc.nextInt());
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        StructNode head = createListFromInput();
        System.out.println("Original list:");
        printList(head);

        head = addAlternateNodes(head);
        System.out.println("Modified list:");
        printList(head);
    }
}
