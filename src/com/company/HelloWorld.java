package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class HelloWorld {
    public static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String x, String y) {
            if(x.length() > y.length()) {
                return 1;
            } else if(x.length() < y.length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void nextPermutation(int[] nums) {
        // 从右向左找第一个nums[i] < nums[i+1]的i
        // 找大于nums[i]的最小nums[minIndex]
        // swap(nums[i], nums[minIndex])
        // sort(i+1, len - 1)

        int len = nums.length;
        if(len == 0) {
            return;
        }
        for(int i = len - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                int j = i + 1;
                int minIndex = j;
                while(j < len) {
                    if(nums[j] < nums[minIndex] && nums[j] > nums[i]) {
                        minIndex = j;
                    }
                    j++;
                }
                int tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;
                Arrays.sort(nums, i + 1, len - 1);
                return;
            }
        }
        Arrays.sort(nums);
    }

    public static double myPow(double x, int n) {
        if(x == 0 || x == 1) {
            return x;
        }
        boolean flag = true;
        if(n < 0) {
            if(n == -2147483648) {
                return 1;
            }
            n = n * (-1);
            flag = false;
        }
        if(x == -1) {
            if(n % 2 == 0) {
                return 1;
            } else {
                return -1;
            }
        }
        if(n == 0) {
            return 1;
        }

        // 快速幂
        double cur = x;
        double res = 1;
        while(n != 0) {
            if((n & 2) == 1) {
                res = res * cur;
            }
            cur = cur * cur;
            n = n >> 1;
        }
        if(!flag) {
            res = 1 /  res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Test starts...");
        System.out.println("Test end...");
        double res = myPow(8.8, 3);
        int nums[] = {1, 3, 2};
        nextPermutation(nums);

        // Java Basic
        System.out.println("THE BEGINNING.");
        // Int
        System.out.println("Int:");
        int intA = Integer.MAX_VALUE;
        int intB = Integer.MIN_VALUE;
        int bull = 18;
        String bullStr = Integer.toString(bull);
        System.out.println(intA); // INT_MAX 2147483647
        System.out.println(intB); // INT_MIN -2147483648
        // Array
        System.out.println("Array:");
        int array[] = new int[2];
        int len = array.length;
        System.out.println(len);
        int[] array2 = {2, 1, 3};
        Arrays.sort(array2);
        Arrays.sort(array2, 1, 3); // startIndex(inclusive), endIndex(exclusive)
        // 将一个字符串数组按字典序重新排列
        String array3[] = {"cba", "abc", "adb"};
        Arrays.sort(array3);
        // List
        System.out.println("List:");
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<Integer>(list); // copy list
        int a1 = 1;
        list.add(a1);
        System.out.println(list.get(0));
        // Map
        Map<String, String> map = new HashMap<>();
        map.containsKey("");
        map.get("");
        map.put("", "");
        for(String s: map.keySet()) {
            // do something
        }
        // Set
        System.out.println("Set:");
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> setli = new ArrayList<>();
        set.add(setli);
        List<List<Integer>> lli = new ArrayList<>();
        for(List<Integer> li : set) {
            lli.add(li);
        }
        // Queue
        // Stack
        System.out.println("Stack:");
        Stack<Character> stack = new Stack<>();
        stack.push('q');
        stack.empty();
        System.out.println(stack.peek());
        stack.pop();
        // heap, priority queue
        System.out.println("PriorityQueue:");
        Comparator<String> comparator = new StringComparator();
        PriorityQueue<String> pq = new PriorityQueue<>(len, comparator);
        pq.add("abc");
        pq.size();
        System.out.println(pq.peek());
        pq.poll();
        // int
        /**
         * Integer is a class with a single field of type int
         * byte has Byte
         * short has Short
         * int has Integer
         * long has Long
         * boolean has Boolean
         * char has Character
         * float has Float
         * double has Double
         */
        System.out.println("Integer:");
        int integer = Integer.parseInt("1");
        System.out.println(integer);
        // char
        /**
         * The Character class wraps a value of the primitive type char in an object.
         * An object of type Character contains a single field whose type is char.
         * In addition, this class provides several methods for determining a character's category
         * (lowercase letter, digit, etc.) and for converting characters from uppercase to lowercase and vice versa.
         * Character information is based on the Unicode Standard, version 6.0.0.
         */
        System.out.println("Character:");
        char ch = 'a';
        char chUpper = Character.toUpperCase(ch);
        int intToChar = 9;
        char chFromInt = Character.forDigit(intToChar, 10);
        System.out.println(ch);
        System.out.println(chUpper);
        String s1 = "";
        char c = 'c';
        s1 += c;
        System.out.println(s1);
        // String char
        System.out.println("THE END.");
    }
}
