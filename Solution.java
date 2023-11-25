import static java.lang.Math.*;
class Solution 
{
    public static int maxProduct(int[] nums) 
    {
        int n=nums.length;
        int max1=nums[0],pro=1;
        for(int i=0;i<n;i++)
        {
            pro*=nums[i];
            max1=max(max1,pro);
             if(pro==0){
                pro=1;
            }
        }
    return max1;
    }

public static void main(String[] args){
  int arr[]={3,-1,4};
  int ans=maxProduct(arr);
  System.out.println(ans);
}
}