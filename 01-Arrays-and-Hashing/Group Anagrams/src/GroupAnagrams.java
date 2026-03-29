import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        System.out.println(g.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Sort the characters to create a key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

}
