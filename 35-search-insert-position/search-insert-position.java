class Solution 
{
    int count;
    int a;
    public int searchInsert(int[] nums, int target) 
    {
       for(int ind = 0 ;ind < nums.length; ind++) 
       {
        if(nums[ind] == target)
        {
            count++;
            a = ind;
        }
       }
       if(count == 0)
       {
        for(int ind = 0 ;ind < nums.length ; ind++)
        {
            if(nums[ind] > target)
            {
                a = ind;
                return a;
            }
        }
        if(target > nums[nums.length-1])
        {
            return nums.length;
        }
       }
       return a;
    }
}