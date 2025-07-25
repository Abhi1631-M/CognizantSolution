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

        List<String> wordsList = new ArrayList<>();
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String token : tokens) {

            if (!token.trim().isEmpty()) {
                String word = token.toLowerCase();
                wordsList.add(word);
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Total number of words " + wordsList.size());
        System.out.println("Words with the count");

        List<String> sortedUniqueWords = new ArrayList<>(wordCounts.keySet());
        Collections.sort(sortedUniqueWords);

        for (String word : sortedUniqueWords) {
            System.out.println(word + "-" + wordCounts.get(word));
        }

        sc.close();
    }
    }

