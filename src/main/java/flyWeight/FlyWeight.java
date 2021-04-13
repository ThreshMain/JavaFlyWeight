package flyWeight;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class FlyWeight {
    private static FlyWeight instance;


    private final HashMap<URL, BufferedImage> images;
    private FlyWeight() {
        images = new HashMap<>();
    }

    public BufferedImage getImage(URL url) throws IOException {
        if (!images.containsKey(url)) {
            images.put(url, ImageIO.read(url));
        }
        return images.get(url);
    }

    public static FlyWeight getInstance() {
        if (instance == null) {
            instance = new FlyWeight();
        }
        return instance;
    }
}

