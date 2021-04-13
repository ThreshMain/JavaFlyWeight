package flyWeight;

import java.net.URL;
import java.util.ArrayList;

public class PathManager {
    private static PathManager instance;
    private final ArrayList<URL> urls;

    private PathManager() {
        urls = new ArrayList<>();
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource;
        String[] fileNames = new String[]{"water.jpeg", "grass.jpeg", "stone.jpeg", "cloud.jpeg"};
        for (String fileName : fileNames) {
            resource = classLoader.getResource(fileName);
            if (resource != null) {
                urls.add(resource);
            }
        }
    }

    public ArrayList<URL> getUrls() {
        return new ArrayList<>(urls);
    }

    public static PathManager getInstance() {
        if (instance == null) {
            instance = new PathManager();
        }
        return instance;
    }

    public URL getURL(int i) {
        return urls.get(i);
    }

    public int getSize() {
        return urls.size();
    }
}
