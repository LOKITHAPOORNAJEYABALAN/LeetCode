class Solution 
{
    int number;
    public int majorityElement(int[] nums) 
    {
       
            int count = 1;
            number = nums[0];
            for(int i = 1 ;i < nums.length ;i++)
            {
                
                if(nums[i]== number)
                {
                    count++;
                }
                else
                {
                    count--;
                    if(count == 0)
                    {
                       number  = nums[i];
                        count = 1;
                    }
                }
               
            }
           
        
         return number;
    }
}