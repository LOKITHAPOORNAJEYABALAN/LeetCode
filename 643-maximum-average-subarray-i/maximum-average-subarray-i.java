class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        double maxAvg = Double.NEGATIVE_INFINITY;
        double currSum = 0;
        for(int i = 0 ; i < k ;i++)
        {
            currSum += nums[i];
        }
        maxAvg = currSum / k;
        for(int i = k ; i < nums.length ; i++)
        {
            currSum += nums[i] - nums[i-k];
            double currAvg = currSum / k;
            if(currAvg > maxAvg)
            {
                maxAvg = currAvg;
            }
        }
        return maxAvg;
    }
}