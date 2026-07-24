class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circlesandwich = 0;
        int squaresandwich = 0;
        for(int choice: students){
            if(choice == 0){
                circlesandwich++;
            
           } else{
                squaresandwich++;
            }
        }

            for(int sandwich: sandwiches){
                if(sandwich == 0 && circlesandwich == 0){
                    return squaresandwich;
                
                }else{
                     if(sandwich == 1 && squaresandwich == 0){
                    return circlesandwich;

                }
                }

                if(sandwich == 0){
                    circlesandwich--;
                }
                else {
                    squaresandwich--;
                            }
            }

            return 0;
    }
}

        
