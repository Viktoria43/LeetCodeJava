  class Solution {
        public static int[] decompressRLElist(int[] nums) {

            int count=0;
            int result = 0;
            while(count+2<=nums.length){
                result+=nums[count];
                count +=2;
            }

            int [] array= new int[result];
           int  countCount = 0;
           int countM = nums[countCount];
             int countElement = 1;
            int element = nums[countElement];
            for (int i =0; i<array.length;i++){
                array[i] = element;
               countM--;
               if (countM==0&&countElement+2<nums.length){
                   countCount+=2;
                   countElement+=2;
                   countM=nums[countCount];
                   element=nums[countElement];
               }

            }
            System.out.println(Arrays.toString(array));
            return array;
    }

    }