import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ImageForm extends JFrame {
    public ImageForm() {
        int sizeX = 10;
        int sizeY = 10;
        int imageWidth = 50;
        int imageHeight = 50;

        PathManager pathManager=PathManager.getInstance();
        FlyWeight flyWeight = FlyWeight.getInstance();

        setVisible(true);
        setSize(sizeX*imageWidth, sizeY*imageHeight);
        ArrayList<Image> images = new ArrayList<>();
        Random random = new Random();
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                String randomPath = pathManager.getPath(random.nextInt(pathManager.getSize()));
                try {
                    images.add(new Image(flyWeight.getImage(randomPath), x * imageWidth, y * imageHeight, imageWidth, imageHeight));
                } catch (IOException e) {
                    System.err.println("Something went wrong: " + e.getMessage());
                }
            }
        }
        ImagePanel panel = new ImagePanel(images);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
