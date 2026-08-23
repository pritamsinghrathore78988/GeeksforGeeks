class Solution {
    public int[] twoRepeated(int[] arr) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                ans[index++] = arr[i];
            } else {
                set.add(arr[i]);
            }

            if (index == 2) {
                break;
            }
        }

        return ans;
    }
}