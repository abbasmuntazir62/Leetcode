class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1){
            return 0;
        }
        //finding mid of the of the term
        int mid = 1 << (n - 2);


        //first half
        if(k <= mid){
        return kthGrammar(n-1,k);
    }
    //second half
        return 1 - kthGrammar(n - 1, k - mid);
    }
}