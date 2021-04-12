package ImageForm;

import java.awt.image.BufferedImage;

public class SimpleImage {

    private BufferedImage image;
    private int x,y, width,height;

    public SimpleImage(BufferedImage image, int x, int y, int width, int height) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public SimpleImage(BufferedImage image, int x, int y) {
        this(image,x,y,50,50);
    }

    public BufferedImage getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
