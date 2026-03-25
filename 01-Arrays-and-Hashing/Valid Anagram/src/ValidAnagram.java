public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // 1. Performance Guard: If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) return false;

        // 2. Frequency Array: Fixed size 26 for English lowercase 'a'-'z'
        int[] charCounts = new int[26];

        // 3. Single-Pass Tally
        // We increment for 's' and decrement for 't' simultaneously
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // 4. Final Validation
        // If the strings are anagrams, every index must be exactly 0
        for (int count : charCounts) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        // Test Cases
        System.out.println("Test 1 (racecar/carrace): " + solution.isAnagram("racecar", "carrace")); // true
        System.out.println("Test 2 (jar/jam): " + solution.isAnagram("jar", "jam"));             // false
    }
}