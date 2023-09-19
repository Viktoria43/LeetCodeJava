class Solution {


        public static String longestCommonPrefix(String[] strs) {
            int count = strs.length-1;
            String compare = strs[strs.length-1];
            int count2 = strs.length;
            String result = new String("");
            String prefix = strs[0];
            int index =0;
            if (strs.length > 1) {

                for (int j = 0; j < count2; j++) {
                    if (strs[j].length() < prefix.length()) {
                        prefix = strs[j];
                       index=j;

                    }
                    if (strs[j].equals("")) {
                        return strs[j];
                    }
                    if (index == strs.length-1){
                        compare = strs[strs.length-2];
                    }
                }



                for (int i = 0; i <= prefix.length(); i++) {
                    if (i < prefix.length() && i < compare.length() && prefix.charAt(i) != compare.charAt(i) && count == strs.length-1 ) {
                        if (count-2 != index && count-2>-1 ){
                            count -= 2;
                            compare = strs[count];
                            result = result.substring(0, i);
                            i = -1;
                        }
                        else if (count-1 != index && count-1>-1){
                            count--;
                            compare = strs[count];
                            result = result.substring(0, i);
                            i = -1;
                        }else return result;


                    } else if (i < prefix.length() && i < compare.length() && prefix.charAt(i) == compare.charAt(i) && count == strs.length - 1) {
                        result += String.valueOf(prefix.charAt(i));
                    } else if (i < prefix.length() && i < result.length() && result.charAt(i) != compare.charAt(i)) {
                        result = result.substring(0, i);
                    } else if (i  == prefix.length() && count > 1) {
                        if (count-2 != index && count-2>-1 ){
                            count -= 2;
                            compare = strs[count];
                           
                            i = -1;
                        }
                        else if (count-1 != index && count-1>-1){
                            count--;
                            compare = strs[count];
                          
                            i = -1;
                        }
                    }
                }



            }
            if (strs.length == 1) {
                return prefix;
            }

            return result;
        }
    }