package imageForm;

import flyWeight.FlyWeight;
import flyWeight.PathManager;

import javax.swing.*;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class ImageForm extends JFrame {
    public ImageForm() {
        this(10, 10);
    }

    public ImageForm(int sizeX, int sizeY) {
        super("Test");
        int imageWidth = 50;
        int imageHeight = 50;

        PathManager pathManager = PathManager.getInstance();
        FlyWeight flyWeight = FlyWeight.getInstance();

        ArrayList<SimpleImage> images = new ArrayList<>();
        Random random = new Random();
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                URL randomURL = pathManager.getURL(random.nextInt(pathManager.getSize()));
                try {
                    images.add(new SimpleImage(flyWeight.getImage(randomURL), x * imageWidth, y * imageHeight, imageWidth, imageHeight));
                } catch (IOException e) {
                    System.err.println("Something went wrong: " + e.getMessage());
                }
            }
        }
        ImagePanel panel = new ImagePanel(images,new Dimension(sizeX * imageWidth,sizeY * imageHeight));
        add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
