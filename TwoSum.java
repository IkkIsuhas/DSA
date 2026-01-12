// class TwoSum {
//     public static void main(String args[]){
//         TwoSum s = new TwoSum();
//         int [] arr = {2,7,11,15};
//         int targets = 9;
//         int [] result = s.two(arr, targets);
//         if (result != null){
//             System.out.println(result[0]+" "+result[1]);
//         }else{
//             System.out.println("the tagret element is less then zero");
//         }
//     }
//     public int[] two(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for (int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//     return null;
//     }
// }
public class TwoSum {
    public static void main(String[] args) {
        TwoSum w = new TwoSum();
        int [] arr = {2,7,11,15};
        int target = 9;
        int [] sum = w.twoSum(arr, target);
        System.out.println("Result: "+sum[0]+" "+sum[1]);
    }
    public int [] twoSum(int [] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
        int result = nums[left] + nums[right];
        if(result == target){
            return new int[]{left,right};
        }else if(result < target){
            left++;
        }else{
            right--;
        }
    }
     return null;
    }
}
