class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < a.length || j < b.length || k < c.length) {
            int min = Integer.MAX_VALUE;

            if (i < a.length)
                min = Math.min(min, a[i]);

            if (j < b.length)
                min = Math.min(min, b[j]);

            if (k < c.length)
                min = Math.min(min, c[k]);

            if (i < a.length && a[i] == min) {
                ans.add(a[i]);
                i++;
            }

            if (j < b.length && b[j] == min) {
                ans.add(b[j]);
                j++;
            }

            if (k < c.length && c[k] == min) {
                ans.add(c[k]);
                k++;
            }
        }

        return ans;
    }
}