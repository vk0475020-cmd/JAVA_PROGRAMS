class Solution {
    public int minimumPushes(String word) {
        // ~find frequency of each char
        // ~sort (desc)
        // ~freq * press(i/8 + 1)
        int freq[]=new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);     //acc
        int r=0;
        for(int i=0;i<26;i++){
            int f=freq[25-i]; //desc 
            int press=i/8 +1;
            r+=press * f;
        }
        return r;
    }
}