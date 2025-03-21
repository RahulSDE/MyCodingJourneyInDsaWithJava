package Week_6_ArraysAndArrayList.HotsQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElements {
    public static ArrayList<Integer> majorityElements(int[] nums){
        ArrayList<Integer> ls = new ArrayList<>();
        int desired = nums.length/3;
        /* *************** Brute-Force Approach ********************************/
//        //System.out.println(desired);
//        for(int i=0;i<nums.length;i++){
//            int count = 0;
//            if(i != 0 && nums[i]==nums[i-1]) continue;
//            int x = nums[i];
//            for(int j=0;j<nums.length;j++){
//                if(nums[j]==x) count++;
//            }
//            System.out.println(x);
//            System.out.println(count);
//            if(count>desired) ans.add(x);
//        }

        /* ************** Method - 2 ******************************************/
        for(int i=0;i<nums.length;i++){
            int count = 0;
            if(ls.size()==0 || ls.get(0) != nums[i]){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==nums[i]) {
                        count++;
                    }
                }
                ls.add(nums[i]);
                if(ls.size()==2) break;
            }
        }

        return ls;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        Arrays.sort(nums);
        ArrayList<Integer> ans = majorityElements(nums);
        System.out.println(ans);
    }
}
