class Solution {
     public int findKRotation(int arr[]) {
         int low = 0, high = arr.length - 1;

         while (low < high) {
             int mid = low + (high - low) / 2;

             if (arr[mid] > arr[high]) {
                 // Minimum is in the right half
                 low = mid + 1;
             } else {
                 // Minimum is at mid or in the left half
                 high = mid;
             }
         }

         return low;
     }
 }