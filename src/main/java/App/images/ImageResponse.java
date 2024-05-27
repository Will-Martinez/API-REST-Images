package App.images;

public class ImageResponse {

    private String base64WithWaterMark;
    private String imageType;
    private boolean success;


    public ImageResponse(String base64WithWaterMark, String imageType, boolean success) {
        this.base64WithWaterMark = base64WithWaterMark;
        this.imageType = imageType;
        this.success = success;
    }

    public String getBase64WithWaterMark() {
        return base64WithWaterMark;
    }

    public void setBase64WithWaterMark(String base64WithWaterMark) {
        this.base64WithWaterMark = base64WithWaterMark;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
