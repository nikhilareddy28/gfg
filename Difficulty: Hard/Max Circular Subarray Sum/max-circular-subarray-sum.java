class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n=arr.length;
        int maxs=arr[0];
        int sum=arr[0];
        int mins=arr[0];
        int sum1=arr[0];
         int total=arr[0];
        for(int i=1;i<n;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            maxs=Math.max(maxs,sum);
        
        
            sum1=Math.min(arr[i],sum1+arr[i]);
            mins=Math.min(mins,sum1);
        
             total+=arr[i];
        }
      
        if(maxs<0){
            return maxs;
        }
        return Math.max(maxs,total-mins);
        
    }
}
