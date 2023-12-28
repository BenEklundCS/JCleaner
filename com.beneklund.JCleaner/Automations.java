package com.beneklund.JCleaner;

public class Automations {

    private final IO io;

    public Automations(IO io) {
        this.io = io;
    }

    public void clearDesktop() {
        String path = io.getDesktopPath();
        int deleted = io.deleteFilesAtDir(path);

        if (deleted > 0) {
            System.out.println("Deleted " + deleted + " files successfully.");
        }
        else {
            System.out.println("Did not delete any files.");
        }
    }

    public void emptyDownloads() {
        String path = io.getDownloadsPath();
        int deleted = io.deleteFilesAtDir(path);

        if (deleted > 0) {
            System.out.println("Deleted " + deleted + " files successfully.");
        }
        else {
            System.out.println("Did not delete any files.");
        }
    }
}
