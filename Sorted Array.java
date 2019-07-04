class Solution {
    public int search(int[] nums, int target) {
    
    	int i=0;
    	while(nums[i]<=target) 
    	{
    		if(nums[i]==target) {return i;}
    		i++;
    	}
    	return -1;
    }

    public static void main(String args[]) 
    { 
        int arr[] = {1,2,3,4,5,5,6,6,7,8};
        Solution s = new Solution();
        System.out.println(s.search(arr,6));
        
    } 
}
