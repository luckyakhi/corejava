package in.javacomics.designpatterns.creational.builder;

public class TextFileLoadRequestWithBuilder {
	private String fileLocation;
	private char delimiter;
	private String targetLocation;
	private String targetFormat;
	private Encoding encoding;
	public static Builder getBuilder(){
		return new Builder();
	}
	
	
	
	private TextFileLoadRequestWithBuilder() {
		super();
		
	}

	
	

	public String getFileLocation() {
		return fileLocation;
	}



	public char getDelimiter() {
		return delimiter;
	}



	public String getTargetLocation() {
		return targetLocation;
	}



	public String getTargetFormat() {
		return targetFormat;
	}



	public Encoding getEncoding() {
		return encoding;
	}




	public static class Builder{
		private TextFileLoadRequestWithBuilder request;
		public Builder(){
			request = new TextFileLoadRequestWithBuilder();
		}
		public Builder fileLocation(String fileLocation){
			request.fileLocation=fileLocation;
			return this;
		}
		public Builder delimiter(String delimiter){
			request.delimiter=delimiter.charAt(0);
			return this;
		}
		public Builder targetLocation(String targetLocation){
			request.targetLocation=targetLocation;
			return this;
		}
		public TextFileLoadRequestWithBuilder build(){
			return this.request;
		}
	}

	


	
}
