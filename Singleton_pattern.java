public class AppConfig {
    private static AppConfig instance;
    private AppConfig() {
        System.out.println("AppConfig instance created!");
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig(); 
        }
        return instance;
    }
    public void printConfig() {
        System.out.println("Printing application configuration...");
    }
}

public class Main {
    public static void main(String[] args) {
        
        AppConfig config1 = AppConfig.getInstance();
        config1.printConfig();

              
        AppConfig config2 = AppConfig.getInstance();
        config2.printConfig();

        
        if (config1 == config2) {
            System.out.println("Both config1 and config2 refer to the same instance.");
        } else {
            System.out.println("Different instances (which shouldn't happen in Singleton).");
        }
    }
}

