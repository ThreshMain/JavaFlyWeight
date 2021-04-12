package ImageForm;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ImagePanel extends JPanel {
    private ArrayList<SimpleImage> images;

    public ImagePanel(ArrayList<SimpleImage> images) {
        super();
        this.images = images;
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (SimpleImage image : images) {
            g.drawImage(image.getImage(), image.getX(), image.getY(), image.getWidth(), image.getHeight(), null);
        }
    }
}
