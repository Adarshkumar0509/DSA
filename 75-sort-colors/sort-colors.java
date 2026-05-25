class Solution {
    public void sortColors(int[] nums) {
        int i=0,
        j=nums.length-1,
        k=0;

        while(k<=j){
            if(nums[k] ==1){
                k=k+1;
            }
            else if (nums[k] == 2){
                int temp = nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j--;
            }
            else{
                int temp = nums[i];
                nums[i]=nums[k];
                nums[k]= temp;
                i++;
                k++;
            }
        }
    }
}