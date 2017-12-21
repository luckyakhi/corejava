package in.javacomics.xml;

import java.io.InputStream;

import in.javacomics.datastructures.Tree;

public interface XMLParser {
	
	public Tree<String> parse(InputStream xmlInput) throws  Exception;

}
