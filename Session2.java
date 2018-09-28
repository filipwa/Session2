
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Base64;

public class Session2 {

	public static void main(String[] args) {

		System.out.println(parseDateTimestamp("2001-10-26T23:32:52-03:00"));
		
		System.out.println(readPicture("C:\\Users\\ahmad.alibrahim\\Documents\\index.jpg"));

	}

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

	static public String readPicture(String path) {
		File file = new File(path);

		String encodedfile = null;
		try {
			FileInputStream fileInputStreamReader = new FileInputStream(file);
			byte[] bytes = new byte[(int) file.length()];
			fileInputStreamReader.read(bytes);
			encodedfile = new String(Base64.getEncoder().encode(bytes), "UTF-8");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return encodedfile;

	}

}
