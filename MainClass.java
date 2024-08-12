package project2;

public class MainClass {
	    public static void main(String[] args) {
	        // Get the single instance of ConfigurationManager
	        ConfigurationManager configManager = ConfigurationManager.getInstance();
	        configManager.getSetting("file.txt");
 
	    }
}