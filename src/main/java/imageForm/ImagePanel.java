package imageForm;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ImagePanel extends JPanel {
    private final ArrayList<SimpleImage> images;
    private final Dimension size;

    public ImagePanel(ArrayList<SimpleImage> images,Dimension size) {
        super();
        this.images = images;
        this.size=size;
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (SimpleImage image : images) {
            g.drawImage(image.getImage(), image.getX(), image.getY(), image.getWidth(), image.getHeight(), null);
        }
    }

    @Override
    public Dimension getPreferredSize(){
        return size;
    }
}
