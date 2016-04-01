package com.company;

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
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int res = 1;
        int indx1 = 0; // start index of substring
        map.put(s.charAt(indx1), indx1);
        int indx2 = 1;
        while (indx2 < len && indx1 <= indx2) {
            if (map.containsKey(s.charAt(indx2)) && map.get(s.charAt(indx2)) >= indx1) { // the duplicate indx must between indx1 and indx2
                indx1 = map.get(s.charAt(indx2)) + 1;
            } else {
                int tmp = indx2 - indx1 + 1;
                if (tmp > res) {
                    res = tmp;
                }
            }
            map.put(s.charAt(indx2), indx2);
            indx2++;
        }
        return res;
    }

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

    public static void main(String[] args) {
        System.out.println("Test starts...");
        int res = lengthOfLongestSubstring("aa");
        System.out.println(res);
        System.out.println("Test end...");

        // Java Basic
        System.out.println("THE BEGINNING.");
        // Array
        System.out.println("Array:");
        int array[] = new int[2];
        int len = array.length;
        System.out.println(len);
        int[] array2 = {2, 1, 3};
        Arrays.sort(array2);
        // List
        System.out.println("List:");
        List<Integer> list = new ArrayList<>();
        int a1 = 1;
        list.add(a1);
        System.out.println(list.get(0));
        // Map
        // Set
        System.out.println("Set:");
        Set<List<Integer>> set = new HashSet<>();
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
