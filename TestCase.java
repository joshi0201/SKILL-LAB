package project2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCase {

    @Test
    void testSingletonInstance() {
        ConfigurationManager instance1 = ConfigurationManager.getInstance();
        ConfigurationManager instance2 = ConfigurationManager.getInstance();
        
        // Test that both instances are the same (singleton behavior)
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    void testGetSettingWithValidFile() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        
        // Simulate retrieving a configuration setting from a file
        assertDoesNotThrow(() -> configManager.getSetting("validConfigFile.txt"),
                "Getting settings from a valid file should not throw an exception");
    }

}
