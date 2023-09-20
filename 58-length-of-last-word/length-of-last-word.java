 class Solution {


        public static int lengthOfLastWord(String s) {
            int count = 0;
            for (int i = s.length()-1; i >= 0; i--) {
              if(Character.isLetter(s.charAt(i))){
                  count++;
                }
              if(!Character.isLetter(s.charAt(i))&& count!=0){
                  return count;
              }
              
            }
            return count;
        }
    }