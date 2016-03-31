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

/**
 * Created by yhua on 3/31/16.
 */
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
        int a[] = new int[2];
        int len = a.length;
        System.out.println(len);
        System.out.println("Hello World!");
        int res = lengthOfLongestSubstring("aa");
        String s1 = "";
        char c = 'c';
        s1 += c;
        // List
        List<Integer> row = new ArrayList<Integer>();
        int a1 = 1;
        row.add(a1);
        // Map
        // Set
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        List<List<Integer>> res1 = new ArrayList<List<Integer>>();
        for(List<Integer> li : set) {
            res1.add(li);
        }
        // array
        int[] nums = {1, 2};
        Arrays.sort(nums);
        // Stack
        Stack<Character> stack = new Stack<Character>();
        stack.push('q');
        stack.empty();
        char char1 = stack.peek();
        System.out.println(char1);
        stack.pop();
        // heap, priority queue
        Comparator<String> comparator = new StringComparator();
        PriorityQueue<String> pq = new PriorityQueue<String>(len, comparator);
//        pq.size();
//        pq.peek();
//        pq.poll();
//        pq.add("abc");
        // String char
        System.out.println(s1);
        System.out.println(res);
    }
}
