class Solution {
    public boolean rotateString(String s, String goal) {
        String s2=s+s;
        if (s.length() != goal.length()){
            return false;
        }else if(s2.contains(goal)){
            return true;
        }else
            return false;
    }
}