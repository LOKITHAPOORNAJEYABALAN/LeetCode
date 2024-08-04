class Solution {
    public int maxArea(int[] height) 
    {
        int front=0;
        int max=0;
        int rear=height.length-1;
        while(front < rear)
        {
            int cur = Math.min(height[front] , height[rear]);
            int wid = rear-front;
            max = Math.max(max , cur*wid);
            if(height[front] < height[rear])
            {
            front++;
            }
            else
            {
            rear--;
            }
        }
        return max;
        
    }
}