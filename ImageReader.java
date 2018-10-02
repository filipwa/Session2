import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

public class ImageReader {

    // Generate a base64 representation of an image
    /**
     * @param path
     * @return
     */
    static public String readPicture(String path) {
        File file = new File(path);

        String base64pic = null;
        try {
            @SuppressWarnings("resource")
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] input = new byte[(int) file.length()];
            fileInputStreamReader.read(input);
            base64pic = new String(Base64.getEncoder().encode(input), "UTF-8");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

        return base64pic;

    }

}
