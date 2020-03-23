package Factory;

import Factory.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) throws IllegalArgumentException {
        if (types == ImageTypes.JPG)
            return new JpgReader();

        if (types == ImageTypes.BMP)
            return new BmpReader();

        if (types == ImageTypes.PNG)
            return new PngReader();

        throw new IllegalArgumentException("Unknown image type");
    }
}
