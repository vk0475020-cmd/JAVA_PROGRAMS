class Solution {
    public int findLucky(int[] arr) {
        int arr2[]=new int [501];
        for(int i:arr){
            arr2[i]++;
        }for(int i=500;i>0;i--){
            if(i==arr2[i]){
                return i;
            }
        }return -1;
    }
}