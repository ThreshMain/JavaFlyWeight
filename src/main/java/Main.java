import config.ConfigFrame;
import imageForm.ImageForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ConfigFrame getOptions = new ConfigFrame();
        getOptions.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getOptions.runAfter(() -> {
            ImageForm form = new ImageForm(getOptions.getSizeX(), getOptions.getSizeY());
        });
        getOptions.setVisible(true);
        getOptions.invalidate();
        getOptions.revalidate();
        getOptions.repaint();
    }
}
