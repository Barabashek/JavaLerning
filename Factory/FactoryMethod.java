package Factory;

import Factory.common.ImageReader;
import Factory.common.ImageTypes;

public class FactoryMethod {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
