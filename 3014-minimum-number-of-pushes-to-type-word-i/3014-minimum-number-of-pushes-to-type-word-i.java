class Solution {
    public int minimumPushes(String word) {
        int c=0;
        for(int i=0;i<word.length();i++){
            c+=(i/8)+1;
            // i/8 =>find kar raha hai group kitne hai i=9 >> 9/8 >> group one(0-7) second(8-15)
            //                                                                 1 group one se second group ke leye  +1
        }
        return c;
        
    }
}