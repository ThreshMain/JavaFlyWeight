package FlyWeight;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FlyWeight {
    private static FlyWeight instance;


    private HashMap<String, BufferedImage> images;
    private FlyWeight() {
        images = new HashMap<>();
    }

    public BufferedImage getImage(String path) throws IOException {
        if (!images.containsKey(path)) {
            images.put(path, ImageIO.read(new File(path)));
        }
        return images.get(path);
    }

    public static FlyWeight getInstance() {
        if (instance == null) {
            instance = new FlyWeight();
        }
        return instance;
    }
}

