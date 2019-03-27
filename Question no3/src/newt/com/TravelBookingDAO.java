package newt.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

public class TravelBookingDAO {
	public List<TravelBooking> readAllTravelBooking() throws SQLException {
		List<TravelBooking> bookingList = new ArrayList<TravelBooking>();
		String user = "root";
		String password = "admin";
		String url = "jdbc:mysql://localhost:3306/world";

		String selectQuery = "SELECT BookingId,Source,Destination,VehicleType,PhoneNumber from TRAVELBOOKING";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement psmt = con.prepareStatement(selectQuery);

		ResultSet rset = psmt.executeQuery();

		while (rset.next()) {
			int BookingId = rset.getInt("BookingId");
			String Source = rset.getString("Source");
			String Destination = rset.getString("Destination");
			String VehicleType = rset.getString("VehicleType");

			int PhoneNumber = rset.getInt("Phonenumber");

			bookingList.add(new TravelBooking(BookingId, Source, Destination, VehicleType, PhoneNumber));

		}
		return bookingList;
	}
}
