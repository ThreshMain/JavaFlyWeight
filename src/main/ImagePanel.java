import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ImagePanel extends JPanel {
    private ArrayList<Image> images;

    public ImagePanel(ArrayList<Image> images) {
        super();
        this.images = images;
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Image image : images) {
            g.drawImage(image.getImage(), image.getX(), image.getY(), image.getWidth(), image.getHeight(), null);
        }
    }
}
