class Solution {
int count;
        public static int searchInsert(int[] nums, int target) {


            int right = nums.length - 1;
            int left = 0;


            while (left <= right) {
              int midlle = left + (right - left) / 2;

                if (nums[midlle] == target) {
                    return midlle;

                }
                if (nums[midlle] < target) {
                    left = midlle + 1;
                    // midlle= midlle/2;
                } else right = midlle - 1;

            }
            return left ;
        }
    }
