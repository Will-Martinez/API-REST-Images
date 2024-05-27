package App.images;

public class ImageResponse {

    private String message;
    private String imageType;
    private boolean success;

    public ImageResponse(String message, String imageType, boolean success) {
        this.message = message;
        this.imageType = imageType;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
