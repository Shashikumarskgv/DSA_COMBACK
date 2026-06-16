class Solution {
    public int smallestEvenMultiple(int n) {


        if((n*1)%2==0){
            return n;
        }
        else if((n*2)%2==0){
            return n*2;
        }
        return n;
    }
}