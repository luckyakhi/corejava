package in.javacomics.collections;

import java.util.HashSet;
import java.util.Set;

public class BookingHashMapDemo {

	public static void main(String[] args) {
		Booking booking1 = new Booking("1", "ALLD", "MUM");
		Booking booking2 = new Booking("2", "ALLD", "MUM");
		Booking booking3 = new Booking("1", "MUM", "ALD");
		Set<Booking> bookings = new HashSet<Booking>();
		bookings.add(booking1);
		bookings.add(booking2);
		bookings.add(booking3);
		System.out.println("HashSet now is "+bookings);
				
	}

}
