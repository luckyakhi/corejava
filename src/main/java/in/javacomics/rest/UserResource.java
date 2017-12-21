package in.javacomics.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserResource {
	@RequestMapping(method=RequestMethod.GET,value="/getById",produces="application/json")
	public User getUser(@PathVariable String userId){
		//TODO: remove sysout get User from repository 
		System.out.println("User rest resource get called with userId:"+userId);
		return new User();
	}
}
