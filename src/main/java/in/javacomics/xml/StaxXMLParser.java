package in.javacomics.xml;

import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import in.javacomics.datastructures.Tree;

public class StaxXMLParser implements XMLParser {

	@Override
	public Tree<String> parse(InputStream xmlInput) throws Exception {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader xmlStreamReader= factory.createXMLStreamReader(xmlInput);
		while(xmlStreamReader.hasNext()){
			switch(xmlStreamReader.next()){
				case XMLStreamReader.START_DOCUMENT:
					System.out.println("Start Document");
					break;
				case XMLStreamReader.END_DOCUMENT:
					System.out.println("End Document");
					break;	
				case XMLStreamReader.START_ELEMENT:
					System.out.println("Start Element:"+xmlStreamReader.getName());
					break;
				case XMLStreamReader.END_ELEMENT:
					System.out.println("End Element:"+xmlStreamReader.getName());
					break;	
			}
		}
		return null;
	}

}
