class Solution {
    public int numJewelsInStones(String J, String S) {
    int count=0;
       for(int i=0;i<S.length();i++){
           for(int t=0;t<J.length();t++){
               if(J.charAt(t)==S.charAt(i)){
                count+=1;
                   break;
                   
                   
               }
           }
       }
   return count; }
}
