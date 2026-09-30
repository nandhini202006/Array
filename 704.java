class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
           int mid_value=left+(right-left)/2;
            if(nums[mid_value]==target){
                return mid_value;
            } else if(nums[mid_value]<target){
                    left=mid_value+1;
                }
                    else{
                        right=mid_value-1;

                    }
         }  
        return -1;        
    }     
}
