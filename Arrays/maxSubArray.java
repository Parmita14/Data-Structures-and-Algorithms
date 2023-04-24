class Solution {

    public int maxSubArray(int[] nums) 
{
   int r = 0; //inclusive
   int l = 1; //exclusive
   int sum = 0;
   int max = Integer.MIN_VALUE;
   while (r < l && l <= nums.length)
   {
       sum += nums[l - 1];
       max = sum > max ? sum : max;
       if (sum <= 0) 
       {
           r = l;
           sum = 0;
       }
       l++;
   }
   return max;
}

}