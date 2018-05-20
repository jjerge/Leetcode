class Solution {
 public static int hammingDistance(int x, int y) {
    String xbit=Integer.toBinaryString(x);
        String ybit=Integer.toBinaryString(y);
    	while(ybit.length()!=xbit.length()) {
    		if(ybit.length()>xbit.length()) {
    			xbit="0"+xbit;
    		}
    		else {
    			ybit="0"+ybit;
    			
    		}
    	}
    	int count=0;
    	for(int z=0;z<ybit.length();z++){
    		if(ybit.charAt(z)!=xbit.charAt(z)) {
    			count++;
    		}
    	}
    	return count;
      }
  }
