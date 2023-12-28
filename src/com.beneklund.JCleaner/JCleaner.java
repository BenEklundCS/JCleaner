package com.beneklund.JCleaner;

class JCleaner {
    private static IO io = IO.getInstance();
    private static Menus menu = new Menus(io);
    public static void main(String[] args) {
        // Loop until explicit user exit
        while (true) { 
            menu.mainMenu();
        }
    }
}


