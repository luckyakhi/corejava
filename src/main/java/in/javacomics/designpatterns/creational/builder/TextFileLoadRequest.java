package in.javacomics.designpatterns.creational.builder;

public class TextFileLoadRequest {
	private String fileLocation;
	private String delimiter;
	private String targetLocation;
	private String targetFormat;
	private Encoding encoding;
	
	

	public TextFileLoadRequest(String fileLocation, String targetLocation, String targetFormat, Encoding encoding) {
		super();
		this.fileLocation = fileLocation;
		this.targetLocation = targetLocation;
		this.targetFormat = targetFormat;
		this.encoding = encoding;
	}



	public TextFileLoadRequest(String fileLocation, String delimiter, String targetLocation, String targetFormat) {
		super();
		this.fileLocation = fileLocation;
		this.delimiter = delimiter;
		this.targetLocation = targetLocation;
		this.targetFormat = targetFormat;
	}
	
	


	public TextFileLoadRequest(String fileLocation, String delimiter, String targetLocation, String targetFormat,
			Encoding encoding) {
		super();
		this.fileLocation = fileLocation;
		this.delimiter = delimiter;
		this.targetLocation = targetLocation;
		this.targetFormat = targetFormat;
		this.encoding = encoding;
	}



	public TextFileLoadRequest(String fileLocation, String targetLocation, String targetFormat) {
		super();
		this.fileLocation = fileLocation;
		this.targetLocation = targetLocation;
		this.targetFormat = targetFormat;
	}


	
}
