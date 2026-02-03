//power of TWO    ... Now in the same way you can solve power of 3,4,5,5 etc steps will be same

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        else if(n==1){
            return true;
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
