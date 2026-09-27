class Solution {
    public int search(int[] nums, int target) {
        int x=0;
        int y=nums.length-1;
        while(x<=y){
            int sum=x+(y-x)/2;
            if(nums[sum]==target){
                return sum;
            }else if(target>nums[sum]){
                x=sum+1;
            }else{
                y=sum-1;
            }
        }
        return -1;
        
    }
}