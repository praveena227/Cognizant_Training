package cognizant.qea25qe028;
import java.util.*;

public class Assignment9 {

	//Question 1.  Write a Java program to compare two strings?
    static void compareStrings(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

 // Question 2. Write a Java program to reverse a string?
        static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

     // Question 3. Write a Java program to count the number of vowels and   consonants in a string?
    static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

  //Question 4.  Write a Java program to find the frequency of characters in a   string?
    static void characterFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character Frequencies: " + freq);
    }

 // Question 5. Write a Java program to check if two strings are anagrams?
    static boolean areAnagrams(String s1, String s2) {
        char[] a1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] a2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

 // Question 6. Change a string such that the first character is uppercase, the   second is lowercase, and so on
    static String alternateCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.append(i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
        }
        return result.toString();
    }

 // Question 7. Eliminate the numbers from a string and print only the   alphabets
    static String removeNumbers(String str) {
        return str.replaceAll("[0-9]", "");
    }

 // Question 8. Reverse the words in a sentence
    static String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

 // Question 9.Print the frequency of words in a paragraph
    static void wordFrequency(String paragraph) {
        String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Frequencies: " + freq);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample calls for demonstration
        compareStrings("hello", "Hello");
        System.out.println("Reversed: " + reverseString("hello"));
        countVowelsAndConsonants("Hello World");
        characterFrequency("hello");
        System.out.println("Are anagrams: " + areAnagrams("listen", "silent"));
        System.out.println("Alternate case: " + alternateCase("hello"));
        System.out.println("Without numbers: " + removeNumbers("abc123def456"));
        System.out.println("Reversed words: " + reverseWords("Java is fun"));
        wordFrequency("Java is fun. Java is powerful. Java is everywhere.");
    }
}
