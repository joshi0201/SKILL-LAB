package project1;

	public class WordCounter {

	    private static final int MAX_WORDS = 1000; // Adjust this limit as needed
	    private String[] words = new String[MAX_WORDS];
	    private int[] counts = new int[MAX_WORDS];
	    private int wordCount = 0;

	    // Method to count occurrences of each word in a given text
	    public void countWords(String text) {
	        if (text == null || text.isEmpty()) {
	            return;
	        }

	        // Convert text to lower case to handle case insensitivity
	        String[] wordArray = text.toLowerCase().split("\\s+");

	        for (String word : wordArray) {
	            int index = findWordIndex(word);
	            if (index == -1) {
	                // New word, add it to the arrays
	                if (wordCount < MAX_WORDS) {
	                    words[wordCount] = word;
	                    counts[wordCount] = 1;
	                    wordCount++;
	                }
	            } else {
	                // Existing word, increment the count
	                counts[index]++;
	            }
	        }
	    }

	    // Method to find the index of a word in the array
	    private int findWordIndex(String word) {
	        for (int i = 0; i < wordCount; i++) {
	            if (words[i].equals(word)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    // Method to get the word counts
	    public String getWordCounts() {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < wordCount; i++) {
	            sb.append(words[i]).append(": ").append(counts[i]).append("\n");
	        }
	        return sb.toString();
	    }
	}
