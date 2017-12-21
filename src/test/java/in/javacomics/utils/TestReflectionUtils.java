package in.javacomics.utils;

import java.lang.reflect.Field;

import org.springframework.util.ReflectionUtils;

public class TestReflectionUtils {
	public static Field getPrivateFieldBasedOnName(String fieldName,Class<?> classType) {
		Field elementDataField=ReflectionUtils.findField(classType, fieldName);
		ReflectionUtils.makeAccessible(elementDataField);
		return elementDataField;
	}
}
