package in.javacomics.collections;

public class BookingBadKey {
	private String bookingId;
	private String fromLocation;
	private String toLocation;
	
	
	public BookingBadKey(String bookingId, String fromLocation, String toLocation) {
		super();
		this.bookingId = bookingId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	@Override
	public int hashCode() {
		return (int)(Math.random()*100);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingBadKey other = (BookingBadKey) obj;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", fromLocation="
				+ fromLocation + ", toLocation=" + toLocation + "]";
	}
	
	
}
