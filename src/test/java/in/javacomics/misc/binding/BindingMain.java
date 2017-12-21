package in.javacomics.misc.binding;

import java.io.StringWriter;
import java.net.URL;
import java.util.Date;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import in.javacomics.misc.binding.User;

public class BindingMain {

	public static void main(String[] args) {
		User user = new User("akhi.iitkgp@gmail.com", "akhilesh", "singh", new Date());
		try {
			//Because the creation of JAXBContext instances can be expensive, 
			//JAX-RS implementations usually cache them after they are first initialized
			JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		    URL xsdURL = new BindingMain().getClass().getResource("User.xsd");
		    Schema schema = sf.newSchema(xsdURL);
		    marshaller.setSchema(schema);
			StringWriter stringWriter = new StringWriter();
			marshaller.marshal(user, stringWriter);
			System.out.println(stringWriter);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}

	}

}
