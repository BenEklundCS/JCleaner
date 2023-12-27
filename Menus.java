import java.util.ArrayList;
import java.util.Arrays;

public class Menus {

    private Automations auto = new Automations();

    // Singleton design pattern

    private static Menus instance = null; 

    public static synchronized Menus getInstance()
    {
        if (instance == null)
            instance = new Menus();
 
        return instance;
    }

    public void mainMenu() {
        ArrayList<String> options = new ArrayList<String>(Arrays.asList("0", "1", "2", "3"));
        System.out.println();
        System.out.println("0. Dummy");
        System.out.println("1. Clear desktop");
        System.out.println("2. Empty downloads folder");
        System.out.println("3. Exit program");
        System.out.println();
        IO io = IO.getInstance();
        String userInput = io.getValidatedInput(options);
        
        switch (userInput) {
            case "0": System.out.println("Dummy"); break;
            case "1": auto.clearDesktop(); break;
            case "2": auto.emptyDownloads(); break;
            case "3": System.exit(0); break;
        }
    }
}
