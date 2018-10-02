

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;


public class DateConverter {


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

		return null;
	}

}
