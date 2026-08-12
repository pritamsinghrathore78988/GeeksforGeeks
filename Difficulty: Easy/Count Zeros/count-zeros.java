class Solution {
    int countZeroes(int[] arr) {
        // code here
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        return zero;
    }
}
