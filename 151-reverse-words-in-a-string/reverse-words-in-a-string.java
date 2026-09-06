class Solution {
    public String reverseWords(String s) {
        //spliting the element by giving space 
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        //traversing from backward
        for(int i = words.length-1;i >=0; i-- ){
            sb.append(words[i]);
            sb.append(" ");
        }
    
    return sb.toString().trim();
}
}