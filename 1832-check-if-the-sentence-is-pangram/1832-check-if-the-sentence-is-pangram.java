class Solution {
    public boolean checkIfPangram(String sentence) {
        // pangram is string which contain all the alphabate a-z 
        boolean arr[]=new boolean[26]; 
        for(char i : sentence.toCharArray()){
            arr[i-'a']=true;    
        }for(boolean i: arr){
            if(!i)
                return false;
        }
        return true;
    }
}