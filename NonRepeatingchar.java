package com.klh;
import java.util.LinkedHashMap;
import java.util.Map;
public class NonRepeatingchar {
	public static void main(String[] args) {
        String input = "swiss";
        System.out.println(nrc(input));
    }
    public static char nrc(String str) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("No non-repeating character found.");
	}
}
