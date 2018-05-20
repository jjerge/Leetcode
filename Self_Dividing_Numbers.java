class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> rt = new ArrayList<Integer>();
        while(left!=right+1){
          Boolean tr=true; 
            
            
            
           
             String devide=Integer.toString(left);
                for(int x=0;x<devide.length();x++){
                    int num=devide.charAt(x)-'0';
                   
                    if(devide.charAt(x)=='0' || left%num!=0){
                        tr=false;
                        break;
                    }
                }   
            
         
            if(tr==true){
                 
            rt.add(left);
            }
            left++;
        }
   return rt;  }
}
