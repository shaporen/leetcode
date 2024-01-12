package ru;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i < j) {
                    indexes = new int[]{i, j};
                    break;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 5, 9, 11, 13, 16};
        int target = 27;
        int[] indexes = new TwoSum().twoSum(nums, target);
        for (int index : indexes) {
            System.out.println(index);
        }
    }
}
