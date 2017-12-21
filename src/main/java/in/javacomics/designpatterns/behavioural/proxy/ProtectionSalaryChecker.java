package in.javacomics.designpatterns.behavioural.proxy;

public class ProtectionSalaryChecker implements SalaryGenerator{

	@Override
	public int getSalary(String username) {
		if(authenticationPassed(username)){
			return new MonthlySalaryGenerator().getSalary(username);
		}
		return 0;
	}

	private boolean authenticationPassed(String username) {
		return false;
	}

}
