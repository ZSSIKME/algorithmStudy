package org.spz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



    /**
     * 罗马数字 I， V， X， L，C，D , M
     *
     * @param s
     * @return
     */
    public static int romanToTint(String s) {
        int ret = 0;
        s = s.replace("IV", "a");
        s = s.replace("IX", "b");
        s = s.replace("XL", "c");
        s = s.replace("XC", "d");
        s = s.replace("CD", "e");
        s = s.replace("CM", "f");


        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            switch (aChar) {
                case 'M':
                    ret += 1000;
                    continue;
                case 'D':
                    ret += 500;
                    continue;
                case 'C':
                    ret += 100;
                    continue;
                case 'L':
                    ret += 50;
                    continue;
                case 'X':
                    ret += 10;
                    continue;
                case 'V':
                    ret += 5;
                    continue;
                case 'I':
                    ret += 1;
                    continue;
                case 'a':
                    ret += 4;
                    continue;
                case 'b':
                    ret += 9;
                    continue;
                case 'c':
                    ret += 40;
                    continue;
                case 'd':
                    ret += 90;
                    continue;
                case 'e':
                    ret += 400;
                    continue;
                case 'f':
                    ret += 900;
                    continue;
            }
        }
        return ret;
    }


    /**
     * 两数之和
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    /**
     * 回文数判断
     */
    public static boolean isPalindrome(int x) {
        //判断是否为正
        if (x < 0) return false;
        ArrayList<Integer> arrayList = new ArrayList<>();
        //将数据拆分
        while (x / 10 >= 1) {
            int a = x % 10;
            x = x / 10;
            arrayList.add(a);
            if (x / 10 < 1) {
                arrayList.add(x);
            }
        }
        //判断回文
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == arrayList.get(arrayList.size() - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}