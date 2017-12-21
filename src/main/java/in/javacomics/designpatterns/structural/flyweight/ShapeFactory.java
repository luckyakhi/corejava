package in.javacomics.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static Map<String,Shape> cachedShapes = new HashMap<>();
	public static Shape getShape(String shapeName){
		if(cachedShapes.containsKey(shapeName)){
			return cachedShapes.get(shapeName);
		}else{
			if("greenSquare".equalsIgnoreCase(shapeName)){
				Square greenSquare = new Square("green", 4);
				cachedShapes.put("greenSquare", greenSquare);
				return greenSquare;
			}
			else if("redSquare".equalsIgnoreCase(shapeName)){
				Square redSquare = new Square("red", 4);
				cachedShapes.put("redSquare", redSquare);
				return redSquare;
			}
		}
		return null;
	}
}
