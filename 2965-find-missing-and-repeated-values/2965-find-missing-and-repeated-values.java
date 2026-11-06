class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int arr[]=new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[grid[i][j]]++;
            }
        }int arr2[]=new int [2];//[equal,missing]
        for(int i=1;i<=n*n;i++){//given 1 to n^2
            if(arr[i]==2) arr2[0]=i;
            if(arr[i]==0) arr2[1]=i;
        }
        return arr2;
    }
}