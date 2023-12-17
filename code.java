import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CompoundedWords {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<String> words = readWordsFromFile("Input_01.txt");
        Collections.sort(words, Comparator.comparingInt(String::length).reversed());

        Set<String> wordSet = new HashSet<>(words);
        String longestCompoundedWord = "";
        String secondLongestCompoundedWord = "";

        for (String word : words) {
            wordSet.remove(word);

            if (isCompoundedWord(word, wordSet)) {
                if (longestCompoundedWord.isEmpty()) {
                    longestCompoundedWord = word;
                } else {
                    secondLongestCompoundedWord = word;
                    break;
                }
            }

            wordSet.add(word);
        }

        long endTime = System.currentTimeMillis();
        long processingTime = endTime - startTime;

        System.out.println("Longest Compounded Word: " + longestCompoundedWord);
        System.out.println("Second Longest Compounded Word: " + secondLongestCompoundedWord);
        System.out.println("Time taken to process input file: " + processingTime + " milliseconds");
    }

    private static List<String> readWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    private static boolean isCompoundedWord(String word, Set<String> wordSet) {
        if (wordSet.isEmpty()) {
            return false;
        }

        boolean[] dp = new boolean[word.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[word.length()];
    }
}