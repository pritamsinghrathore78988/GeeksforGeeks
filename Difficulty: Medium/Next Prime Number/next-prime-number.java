class Solution {
    public static int nextPrime(int n) {
        int p=4;
        
        n++;
        for(int i=2;i<n;i++){
            if(n%i==0)
            {
                n++;
                i=2;
            }
            
        }
        return n;
        

        // code here to find next prime number
        // return next prime number
    }
}