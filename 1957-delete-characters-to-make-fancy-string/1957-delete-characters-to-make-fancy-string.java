class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
       for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                c=1;
            }
            if(c<=2){
                sb.append(s.charAt(i));
            }
       }
       return sb.toString();
    }
}