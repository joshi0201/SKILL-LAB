package project1;

	import java.util.Scanner;

	public class Main {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        WordCounter wordCounter = new WordCounter();

	        System.out.println("Enter text to count words:");
	        String text = scanner.nextLine();

	        wordCounter.countWords(text);

	        System.out.println("\nWord counts:");
	        System.out.println(wordCounter.getWordCounts());

	        scanner.close();
	    }
	}

