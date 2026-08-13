class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedIntegers  = new HashSet<>();
        while(true){
        
           // finding sum of square of a digit
           int sum = 0; 
           while(n != 0){
            sum += Math.pow(n % 10,2.0);
            n =n/10;
           }
           // checking sum is 1 or not
           if(sum == 1)return true;
           
           // if it is not 1 
           n = sum;
        

  // placing value in a Hashset
  if( usedIntegers.contains(n))
    return false;
  
  usedIntegers.add(n);
}
}
}