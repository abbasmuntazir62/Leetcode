class Solution {
    public double myPow(double x, int n) {
      //checking it is not a negative power
      if(n < 0){
        n =  n * -1;
        x = 1/x;
      }
      double result = 1;
      while(n != 0){
        if(n %2 != 0){
            result = result * x;
        }
        x = x * x;
        n = n/2;
      }
      return result;  
        
    }
}