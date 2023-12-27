public class Automations {
    public void clearDesktop() {
        IO io = IO.getInstance();
        String path = io.getDesktopPath();
        io.deleteFilesAtDir(path);
    }
    public void emptyDownloads() {
        IO io = IO.getInstance();
        String path = io.getDownloadsPath();
        io.deleteFilesAtDir(path);
    }
}
