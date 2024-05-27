package App.images;

import App.images.factories.jpegFactory;
import App.images.factories.jpgFactory;
import App.images.factories.pngFactory;
import App.images.interfaces.StationaryFactory;

import java.util.HashMap;
import java.util.Map;

public class DefineFactory {

    private static Map<String, StationaryFactory> mapFactories() {
        Map<String, StationaryFactory> factories = new HashMap<String, StationaryFactory>();
        factories.put("png", new pngFactory());
        factories.put("jpeg", new jpegFactory());
        factories.put("jpg", new jpgFactory());

        return factories;
    }

    public static StationaryFactory getStationaryFactory(String type) {
        return mapFactories().get(type);
    }
}
