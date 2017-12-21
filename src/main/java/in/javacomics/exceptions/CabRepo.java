package in.javacomics.exceptions;

import java.util.List;

public interface CabRepo {
	public List<Cab> getAvailableCabs() throws Exception;
}
