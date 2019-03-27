package newt.com;

public class TravelBooking {
	int BookingId;
	String Source;
	String Destination;
	String VehicleType;
	int PhoneNumber;

	TravelBooking() {
	}

	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}

	public void setSource(String source) {
		Source = source;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + BookingId;
		result = prime * result + ((Destination == null) ? 0 : Destination.hashCode());
		result = prime * result + PhoneNumber;
		result = prime * result + ((Source == null) ? 0 : Source.hashCode());
		result = prime * result + ((VehicleType == null) ? 0 : VehicleType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelBooking other = (TravelBooking) obj;
		if (BookingId != other.BookingId)
			return false;
		if (Destination == null) {
			if (other.Destination != null)
				return false;
		} else if (!Destination.equals(other.Destination))
			return false;
		if (PhoneNumber != other.PhoneNumber)
			return false;
		if (Source == null) {
			if (other.Source != null)
				return false;
		} else if (!Source.equals(other.Source))
			return false;
		if (VehicleType == null) {
			if (other.VehicleType != null)
				return false;
		} else if (!VehicleType.equals(other.VehicleType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TravelBooking [BookingId=" + BookingId + ", Source=" + Source + ", Destination=" + Destination
				+ ", VehicleType=" + VehicleType + ", PhoneNumber=" + PhoneNumber + "]";
	}

	public TravelBooking(int bookingId, String source, String destination, String vehicleType, int phoneNumber) {
		super();
		BookingId = bookingId;
		Source = source;
		Destination = destination;
		VehicleType = vehicleType;
		PhoneNumber = phoneNumber;
	}

	public int getBookingId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDestination() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getVehicleType() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPhoneNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

}
	