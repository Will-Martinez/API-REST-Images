package App.images.factories;

import App.images.ImageDecoder;
import App.images.interfaces.StationaryFactory;

public class jpgFactory implements StationaryFactory {
    @Override
    public String decode(String base64, String imageType) {
        return ImageDecoder.decodeImage(base64, imageType);
    }
}
