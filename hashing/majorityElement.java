import java.util.HashMap;
public class majorityElement {
        public int majorityEle(int[] nums) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int res = 0;
            for(int i = 0; i<nums.length; i++){
                // if(hm.containsKey(nums[i])){
                //     hm.put(nums[i], map.get(arr[i]) + 1)
                // }else{
                //     hm.put(nums[i], 1);
                // }
                hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
            }
            // Set<Integer> keySet = hm.keySet;
            for(Integer key : hm.keySet()){
                if(hm.get(key) > nums.length/2){
                    res = key;
                }
            }
        return res;
        }
        public static void main(String[] args) {
            int[] arr = {2,3,4,2,2,4,2,2};
            majorityElement m = new majorityElement();
            System.out.println(m.majorityEle(arr));
        }
    }
