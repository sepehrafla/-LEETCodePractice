class Solution {
    public int findKthLargest(int[] nums, int k) {      
        for (int i = 0; i< nums.length-1; i++){
            for (int j = i; j< nums.length; j++){
                if (nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums [j] = temp;
                }
            }
        }
        return nums[k-1];
    }
}