import java.util.HashMap;
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
 String[] bit={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	HashMap<Character,String> morstran = new HashMap<Character,String>();
    	        char a='a';
    	        int count=0;
    	        while(count !=26){
    	            morstran.put(a,bit[count]);
    	            a++;
    	            count++;
    	            
    	        }
    	        count=0;
    	        String[] bitvers = new String[words.length];
    	        for(String red: words){
    	        String temp="";
    	            for(int i=0;i<red.length();i++){
    	            temp+=morstran.get(red.charAt(i));
    	        }
    	            bitvers[count]=temp;
    	            count++;
    	        }
    	        count=0;
    	        HashMap<String,Integer> seen=new HashMap<String,Integer>();
    	        for(int i=0;i<bitvers.length;i++) {
    	        if(!seen.containsKey(bitvers[i])) {
    	        	count++;
    	        	seen.put(bitvers[i], count);
    	        	
    	        }
    	        }
    			return count;
    }
}
