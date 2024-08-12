package project2;

public class ConfigurationManager {
	    private static ConfigurationManager instance = null;
	    private ConfigurationManager() {
	        System.out.println("ConfigurationManager instance created.");
	        // Simulate reading from a configuration file
	        System.out.println("Reading configuration settings from file...");
	    }

	    // Public method to provide access to the single instance of the class
	    public static ConfigurationManager getInstance() {
	        if (instance == null) {
	            instance = new ConfigurationManager();
	        }
	        return instance;
	    }
	    public void getSetting(String file) {
	        // Simulate updating a configuration setting
	        System.out.println("provided settings to the rest of the application from the given configuration file ");
	    }
	}

