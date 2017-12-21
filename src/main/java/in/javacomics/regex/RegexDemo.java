package in.javacomics.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {


	public static void main(String[] args) {
		String inputString = "The number is 100";
		//Using matcher to match entire input string
		Pattern pattern = Pattern.compile("The number is \\d+");
		Matcher matcher = pattern.matcher(inputString);
		if(matcher.matches()){
			System.out.println(matcher.group());
		}
		
		inputString = "The number is 200 something something The number is 1000";
		matcher = pattern.matcher(inputString);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}

}
