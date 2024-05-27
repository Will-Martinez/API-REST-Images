package App.images.factories;

import App.images.interfaces.StationaryFactory;

public class jpegFactory implements StationaryFactory {

    @Override
    public String createImage() {
        return "jpeg image created.";
    }
}
