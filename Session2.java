
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Base64;

public class Session2 {

	public static void main(String[] args) {

		System.out.println(parseDateTimestamp("2001-10-26T23:32:52-03:00"));
		
		System.out.println(readPicture("C:\\Users\\ahmad.alibrahim\\Documents\\index.jpg"));

	}

	// creates a Instant object of an XML time stamp
	/**
	 * @param instant
	 * @return
	 */
	static public Instant parseDateTimestamp(String instant) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
		Date parsedDate = null;
		;
		try {
			parsedDate = dateFormat.parse(instant);
		} catch (ParseException e) {
			System.out.println(e.toString());
		}

		return parsedDate.toInstant();
	}

	/**
	 * 
	 * @param instant
	 * @param duration example: "PT2D"
	 * @return
	 */
	public Instant addDurationToTimeStamp(String instant, String duration) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
		Date parsedDate = null;
		;
		try {
			parsedDate = dateFormat.parse(instant);
		} catch (ParseException e) {
			System.out.println(e.toString());
		}

		return null;
	}

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
