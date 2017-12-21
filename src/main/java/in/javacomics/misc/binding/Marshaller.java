package in.javacomics.misc.binding;

import javax.xml.bind.JAXBException;

public interface Marshaller<T,V> {
	public V marshal(T object) throws JAXBException;
	public T unmarshal(V stream) throws JAXBException;
}
