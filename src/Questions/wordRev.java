package Questions;

import java.util.Scanner;

public class wordRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        scanner.close();

        String reversedSentence = reverseFirstLastChars(sentence);
        System.out.println("Sentence with first and last characters of each word reversed:");
        System.out.println(reversedSentence);
    }

    public static String reverseFirstLastChars(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char first = word.charAt(word.length() - 1);
                char last = word.charAt(0);
                String middle = word.substring(1, word.length() - 1);
                result.append(first).append(middle).append(last).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}