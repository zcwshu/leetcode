import java.util.HashMap;

/**
 * @Author: AndrewBar
 * @Date: Created in 21:04 2020/7/23
 */
public class TwoSum {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,100);
        int temp  = map.get(1);
        System.out.println(temp);
    }
    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i){
                return new int[] {i,map.get(temp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
