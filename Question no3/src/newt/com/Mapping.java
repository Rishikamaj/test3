package newt.com;

import java.sql.SQLException;

public class Mapping {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
TravelBooking tb=new TravelBooking();
TravelBookingDAO tbd=new TravelBookingDAO();
		MapMethods mp = new MapMethods();
		mp.getTravelBooking("Bangalore");

	}

}
