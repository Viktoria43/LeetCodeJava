class Solution {

            public static int romanToInt(String s) {
                String [] arr = s.split("");
                int number = 0;
                for (int i =0; i<s.length();i++){
                    if (arr[i].equals("I") && i+1 < arr.length && arr[i+1].equals("V") ){
                        number += 4;
                        i++;
                    }
                    else if (arr[i].equals("I")&& i+1 < arr.length&& arr[i+1].equals("X")){
                        number += 9;
                        i++;
                    }
                    else if (arr[i].equals("X")&& i+1<arr.length&& arr[i+1].equals("L")){
                        number += 40;
                        i++;
                    }else if (arr[i].equals("X")&& i+1 < arr.length&& arr[i+1].equals("C")){
                        number += 90;
                        i++;
                    }
                    else if (arr[i].equals("C")&& i+1<arr.length&& arr[i+1].equals("D")){
                        number += 400;
                        i++;
                    }
                    else if (arr[i].equals("C")&& i+1 <arr.length&& arr[i+1].equals("M")){
                        number += 900;
                        i++;
                    }else if (arr[i].equals("I")){
                        number += 1;
                    }
                    else if (arr[i].equals("V")){
                        number += 5;
                    }
                    else if (arr[i].equals("X")){
                        number += 10;
                    }
                    else if (arr[i].equals("L")){
                        number += 50;
                    }
                    else if (arr[i].equals("C")){
                        number += 100;
                    }
                    else if (arr[i].equals("D")){
                        number += 500;
                    }
                    else if (arr[i].equals("M")){
                        number += 1000;
                    }
                }
                return number;
            }

        }
        
        