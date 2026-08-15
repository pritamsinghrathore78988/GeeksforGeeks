/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */



class Solution {
    public int getKthFromLast(Node head, int k) {

        Node nn = head;
        int nodes = 0;

        // Count total nodes
        while (nn != null) {
            nn = nn.next;
            nodes++;
        }

        // k is greater than number of nodes
        if (k > nodes || k <= 0) {
            return -1;
        }

        // Position from beginning
        int s = nodes - k;

        nn = head;

        for (int i = 0; i < s; i++) {
            nn = nn.next;
        }

        return nn.data;
    }
}