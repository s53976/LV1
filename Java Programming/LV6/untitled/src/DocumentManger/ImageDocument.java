package DocumentManger;

public class ImageDocument extends Document {
    private int sizeX;
    private int sizeY;
    private String color;


    public ImageDocument(String fileName, int sizeX, int sizeY, String color) {
        super(fileName);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.color = color;
    }


    @Override
    public void printDocument() {

    }
}
