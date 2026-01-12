public class While {
    public static void main(String[] args) {
        While w = new While();
        int [] arr = {2,7,11,15};
        int target = 0;
        boolean sum = w.twoSum(arr,target);
        System.out.println("Result: "+sum);
    }
    public boolean twoSum(int [] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
        int result = nums[left] + nums[right];
        if(result == target){
            return true;
        }else if(result < target){
            left++;
        }else{
            right--;
        }
    }
     return false;
    }
}
