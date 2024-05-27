package App.images.interfaces;

public interface StationaryFactory {
    String decode(
            String base64,
            String imageType,
            String waterMark,
            String fontType,
            Integer x,
            Integer y
    );
}
