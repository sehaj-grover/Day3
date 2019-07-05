class Solution {
    public int search(int[] nums, int target) {
    
        int start=0,end=1;
        int mid;
        try{
        while(nums[end]<target)
        {
            start=end;
            end*=2;
        }
        return binarySearch(nums, start, end, target);
        }
        catch(Exception e)
        {
            try {
            while(nums[start]<=target) 
            {
                if(nums[start]==target){return start;}
                start++;
            }
            return -1;
            }
            catch(Exception i) {return -1;}
        }
        
    }
    public  int binarySearch(int[] arr,int start,int end, int target) 
    {
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            
            if(arr[mid]==target) {return mid;}
            else if(arr[mid]<target) {start=mid+1;}
            else{end=mid-1;}
        }
        return -1;
        
    }
    public static void main(String args[]) 
    { 
        int arr[] = {1,2,3,4,5,5,6,6,7,8};
        Solution s = new Solution();
        System.out.println(s.search(arr,8));
        
    } 
}