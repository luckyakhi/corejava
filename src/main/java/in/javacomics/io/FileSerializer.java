package in.javacomics.io;
/*package in.javacomics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.util.ReflectionUtils;
import org.springframework.util.ReflectionUtils.FieldCallback;

public class FileSerializer<T> implements Serializer<T,FileWriter> {
	
	private Class<T> type;

	public FileSerializer(Class<T> type) {
		super();
		this.type = type;
	}



	@Override
	public void serialize(List<T> objectList, FileWriter fileWriter) {
		try {
		//FieldCallback fc = field-> {
			//ReflectionUtils.makeAccessible(field);
		//	Object fieldValue = ReflectionUtils.getField(field, objectList.get(0));
				try {
					//fileWriter.append(field.getName()+":"+fieldValue);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		//};
	//	ReflectionUtils.(type, fc);
	
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
*/