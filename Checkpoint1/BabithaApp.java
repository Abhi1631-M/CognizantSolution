package Checkpoint1;

import java.util.*;

public class BabithaApp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Initialize Scanner

        System.out.println("Enter the paragraph typed");
        String paragraph = sc.nextLine();


        String splitChars = "[,;:.!?@#$%\\s]+"; // Added \\s for whitespace and made + for one or more delimiters
        String[] tokens = paragraph.split(splitChars);

        List<String> wordsList = new ArrayList<>(); // To store all words in order
        Map<String, Integer> wordCounts = new HashMap<>(); // To store word frequencies

        for (String token : tokens) {

            if (!token.trim().isEmpty()) { // Use trim() to handle tokens that might be just whitespace
                String word = token.toLowerCase(); // Convert to lowercase for case-insensitive counting
                wordsList.add(word); // Add to the list of all words
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1); // Increment count in map
            }
        }

        System.out.println("Total number of words " + wordsList.size());
        System.out.println("Words with the count");

        List<String> sortedUniqueWords = new ArrayList<>(wordCounts.keySet());
        Collections.sort(sortedUniqueWords);

        for (String word : sortedUniqueWords) {
            System.out.println(word + "-" + wordCounts.get(word));
        }

        sc.close(); // Close the scanner
    }
    }

