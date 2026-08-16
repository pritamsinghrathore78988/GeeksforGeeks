/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/


class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(Node root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.data);
        inorder(root.right, result);
    }
}