class Solution {
    public int removeDuplicates(int[] nums) {

        // easy question 
int j=0;
for(int i=0;i<nums.length;i++){
    if(nums[j]!=nums[i]){
        j++;
        nums[j]=nums[i];
    }
}
return j+1;
    }
}
