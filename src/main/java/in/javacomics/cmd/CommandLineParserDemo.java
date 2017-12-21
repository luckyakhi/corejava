package in.javacomics.cmd;

import java.util.Map.Entry;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CommandLineParserDemo {

	public static void main(String[] args) throws ParseException {
		CommandLine commandLine = cmlParse(args); 
		System.out.println("Enviroment:"+commandLine.getOptionValue("e"));
		System.out.println("Spring Config File:"+commandLine.getOptionValue("configFile"));
		System.out.println("Verbose argument present:"+commandLine.hasOption("v"));
		if(commandLine.hasOption("p")){
			for (Entry<Object, Object> property : commandLine.getOptionProperties("p").entrySet()) {
				System.out.println("Property name:"+property.getKey()+" Property value:"+property.getValue());
			}
		}
	}

	private static CommandLine cmlParse(String[] args) throws ParseException  {
		Option passthroughOption = Option.builder().hasArgs().valueSeparator().desc("Passthrough parameter")
				.longOpt("p").build();
		Options options = new Options().addOption("e", "env", true, "Enviroment")
										.addOption("c","configFile",true,"Location of Spring Config file")
										.addRequiredOption("v", "verbose", false, "VerboseArgument")
										.addOption(passthroughOption);
		return new DefaultParser().parse(options, args);
	}

}
