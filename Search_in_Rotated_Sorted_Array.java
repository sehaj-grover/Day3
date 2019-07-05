class Solution {
    public int search(int[] nums, int target) {
    int length=nums.length;
        int start=0,end=length-1;
        while(start<=end )
        {
            int mid=(start+end)/2;
            if(nums[mid]==target){return mid;}
            
            if(nums[mid]<nums[end])
            {
                if(target>nums[mid] && target<=nums[end]){start=mid+1;}
                else{end=mid-1;}
            }
            else
            {
                if(target>=nums[start] && target<nums[mid]){end=mid-1;}
                else{start=mid+1;}
            }
            
        }   
        return -1;
    }
    public static void main(String args[]) 
    { 
        int arr[] = {4,5,6,7,0,1,2};
        Solution s = new Solution();
        System.out.println(s.search(arr,2));
        
    } 
}