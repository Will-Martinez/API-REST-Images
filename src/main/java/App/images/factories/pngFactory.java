package App.images.factories;

import App.images.interfaces.StationaryFactory;

public class pngFactory implements StationaryFactory {

    @Override
    public String createImage() {
        return "png image created.";
    }
}
