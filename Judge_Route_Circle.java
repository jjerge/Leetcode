class Solution {
    public boolean judgeCircle(String moves) {
      HashMap<Character,Integer> rt = new HashMap<Character,Integer>();
    	rt.put('U', 0);
    	rt.put('D', 0);
    	rt.put('L', 0);
    	rt.put('R', 0);
    	for(int i=0;i<moves.length();i++) {
    			rt.replace(moves.charAt(i), rt.get(moves.charAt(i))+1);
    		}
    		if(rt.get('U')-rt.get('D')!=0 ||rt.get('L')-rt.get('R')!=0) {
    			return false;
    		}
    	
    	return true;
    } 
    
}
