package ohm.softa.a07.api;

import retrofit2.http.GET;
import retrofit2.http.Path;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * Created by Peter Kurfer on 11/19/17.
 */

public interface OpenMensaAPI {
	// TODO add method to get meals of a day
	// example request: GET /canteens/229/days/2017-11-22/meals

	@GET("/canteens/{id}/days/{date}/meals")
	Object getMeals(@Path("id") int id, @Path("date") SimpleDateFormat date);
}
