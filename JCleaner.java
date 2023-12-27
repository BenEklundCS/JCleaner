class JCleaner {
    private static Menus menu = Menus.getInstance();

    public static void main(String[] args) {
        // Loop until explicit user exit
        while (true) { 
            menu.mainMenu();
        }
    }
}
