package imageForm;

import java.awt.image.BufferedImage;

public class SimpleImage {

    private final BufferedImage image;
    private final int x;
    private final int y;
    private final int width;
    private final int height;

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
