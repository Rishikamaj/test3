package newt.com;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMethods {

	public Map<Integer, String> getTravelBooking(String Destination) throws SQLException {
		Map<Integer, String> booked = new HashMap<Integer, String>();
		TravelBookingDAO edao = new TravelBookingDAO();
		//List<TravelBooking> bookingist = edao.readAllTravelBooking();
		System.out.println("Filtering theTravelBooking by Destination:....");
		Iterator<TravelBooking> iter = edao.readAllTravelBooking().iterator();
		while (iter.hasNext()) {
			TravelBooking booking = (TravelBooking) iter.next();

			//System.out.println(booking);
			//System.out.println(booking.getDestination());
			if (booking.getDestination().equalsIgnoreCase(Destination)) {
				booked.put(booking.getBookingId(), booking.getSource());
				System.out.println(booked);
			

			}

	

			
		}
		return booked;
	}
}
