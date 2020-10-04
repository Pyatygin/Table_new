import gui.MainFrame;
import handler.GuiHandler;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        GuiHandler.setMainFrame(mainFrame);
    }
}
