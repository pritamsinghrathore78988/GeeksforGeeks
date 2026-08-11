class Solution {
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print '*' on the first column,
                // diagonal, and last row
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}