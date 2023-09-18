class Solution {
            public static int[] twoSum(int[] nums, int target) {
                int[] out = new int[2];
                for (int i =0;i<nums.length;i++){
                    for (int j=i+1;j<nums.length;j++){
if (nums [i]+ nums[j]==target){
out[0]=i;
out[1]=j;
}

                    }
                }
                return out;
            }

            // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        public static void main(String[] args) {
            // Press Opt+Enter with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            // Press Ctrl+R or click the green arrow button in the gutter to run the code.
           int out[] = {0,4,3,0};
           int target =0 ;

           System.out.println((Arrays.toString(twoSum(out,target))));
        }
    }
