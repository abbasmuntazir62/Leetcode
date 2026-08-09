class Solution {
    public int fib(int n) {
            if( n <= 1){
                return n;
            }

            //creating memorizing array
            int [] map = new int[n + 1];

              // put base case
             map[0] = 0;
            map[1] = 1;
        
        // running loop to place value
        for(int i = 2; i <= n; i++){
            map[i] = (map[i-1] + map[i-2]);
        }
        return map[n];
    }
}
        
    