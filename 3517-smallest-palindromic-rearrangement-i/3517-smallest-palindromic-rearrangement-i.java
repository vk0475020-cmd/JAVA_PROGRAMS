// ~we use the palindrome property if half of the palindrom is same to it mirror
    // example daccad    half=>dac | cad    -->daccad     
    //                         (mirror)
    // ~convert string to char Array for convinence
    // ~then we sort the left half 
    // ~left half copy kar denge last me 
    // ~last me string type return kar do 
    //APPROACH
class Solution {
    public String smallestPalindrome(String s) {
        char chararr[] = s.toCharArray();
        int l=chararr.length;
        int mid=l/2;
        Arrays.sort(chararr,0,mid);
        for(int i=0;i<mid ;i++){
            chararr[l-1-i]=chararr[i];
        }return new String(chararr);
    }
    
}