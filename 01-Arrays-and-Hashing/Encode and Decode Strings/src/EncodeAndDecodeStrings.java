import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            // Pattern: length of string + delimiter + the string itself
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        char[] chars = str.toCharArray(); // Convert to primitive array once
        int i = 0;

        while (i < chars.length) {
            // Manually parse the length to avoid Integer.parseInt and substring
            int length = 0;
            while (chars[i] != '#') {
                length = length * 10 + (chars[i] - '0');
                i++;
            }

            i++; // Move past the '#'

            // Use the String constructor that takes an array, offset, and length
            res.add(new String(chars, i, length));

            i += length; // Jump to next segment
        }
        return res;
    }

    public static void main(String[] args) {
        EncodeAndDecodeStrings en = new EncodeAndDecodeStrings();
        List<String> input = List.of("Hello World", "Java#Is#Cool", "");

        String encoded = en.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = en.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}