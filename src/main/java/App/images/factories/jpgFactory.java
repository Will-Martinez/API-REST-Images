package App.images.factories;

import App.images.interfaces.StationaryFactory;

public class jpgFactory implements StationaryFactory {

    @Override
    public String createImage() {
        return "jpg image created.";
    }
}
