package in.javacomics.misc.binding;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class StringMarshaller<T> implements Marshaller<T, String> {

	private javax.xml.bind.Marshaller marshaller;
	private Unmarshaller unmarshaller;
	
	
	
	public StringMarshaller(Class<T> classBound) throws JAXBException {
		super();
		JAXBContext context = JAXBContext.newInstance(classBound);
		marshaller = context.createMarshaller();
		unmarshaller = context.createUnmarshaller();
	}

	@Override
	public String marshal(T object) throws JAXBException {
		StringWriter stringWriter = new StringWriter();
		marshaller.marshal(object, stringWriter);
		return stringWriter.toString();
	}

	@Override
	public T unmarshal(String stream) throws JAXBException {
		return (T) unmarshaller.unmarshal(new ByteArrayInputStream(stream.getBytes()));
	}

}
