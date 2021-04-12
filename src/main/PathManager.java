import java.net.URL;
import java.util.ArrayList;

public class PathManager {
    private static PathManager instance;
    private ArrayList<String> paths;

    private PathManager() {
        paths = new ArrayList<>();
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource;
        String[] fileNames = new String[]{"water.jpeg", "grass.jpeg", "stone.jpeg", "cloud.jpeg"};
        for (String fileName : fileNames) {
            resource = classLoader.getResource(fileName);
            if (resource != null) {
                paths.add(resource.getPath());
            }
        }
    }

    public ArrayList<String> getPaths() {
        return new ArrayList<>(paths);
    }

    public static PathManager getInstance() {
        if (instance == null) {
            instance = new PathManager();
        }
        return instance;
    }

    public String getPath(int i) {
        return paths.get(i);
    }

    public int getSize() {
        return paths.size();
    }
}
