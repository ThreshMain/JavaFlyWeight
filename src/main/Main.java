import ImageForm.ImageForm;
import config.GetOptions;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        GetOptions getOptions = new GetOptions();
        getOptions.setVisible(true);
        getOptions.setSize(500, 80);
        getOptions.runAfter(() -> {
            ImageForm form = new ImageForm(getOptions.getWidth(), getOptions.getHeight());
        });
    }
}
