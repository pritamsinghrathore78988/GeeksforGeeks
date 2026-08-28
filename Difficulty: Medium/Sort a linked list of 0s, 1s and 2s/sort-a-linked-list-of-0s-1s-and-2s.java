/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        int[] count = new int[3];

        // Count 0s, 1s and 2s
        Node curr = head;

        while (curr != null) {
            count[curr.data]++;
            curr = curr.next;
        }

        // Rewrite the linked list in sorted order
        curr = head;

        for (int value = 0; value <= 2; value++) {
            while (count[value] > 0) {
                curr.data = value;
                curr = curr.next;
                count[value]--;
            }
        }

        return head;
    }
}