class FirstLastOccur {
  public static int[] searchRange(int[] nums, int target) {
      int firstOcr=FindFast(nums,target);
      int LastOcr=FindLast(nums,target);
      return new int[]{firstOcr,LastOcr };
  }
  private static int FindFast(int nums[],int target){
      int low=0,high=nums.length-1;
      while(low<=high){
          int mid=low+(high-low)/2;
          if(nums[mid]>target){
              high=mid-1;
          }
          else if(nums[mid]<target){
              low=mid+1;
          }
          else{
              if(mid==0 || nums[mid-1]!=nums[mid]){
                  return mid;
              }
              else{
                  high=mid-1;
              }
          }
      }
      return -1;

  }
private static int FindLast(int nums[],int target){
      int low=0,high=nums.length-1;
       while(low<=high){
          int mid=low+(high-low)/2;
          if(nums[mid]>target){
              high=mid-1;
          }
          else if(nums[mid]<target){
              low=mid+1;
          }
          else{
              if(mid==nums.length-1 || nums[mid]!=nums[mid+1]){
                  return mid;
              }
              else{
                  low=mid+1;
              }
          }
      }
      return -1;
}
public static void main(String[] args) {
  int nums[] = {5,7,7,8,8,10};
  int target = 8;
  System.out.println(searchRange(nums, target));
}
}

