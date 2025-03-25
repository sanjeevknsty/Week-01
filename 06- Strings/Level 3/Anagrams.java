import java.util.Scanner;

public class Anagrams {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] frequency = new int[26];

        for (char c : str1.toLowerCase().toCharArray()) {
            frequency[c - 'a']++;
        }

        for (char c : str2.toLowerCase().toCharArray()) {
            frequency[c - 'a']--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        System.out.println(isAnagram(str1, str2) ? "Anagrams" : "Not Anagrams");
    }
}
