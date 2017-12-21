package in.javacomics.designpatterns.behavioural.visitor;

public class DifferenceCalculateVisitor implements Visitor {

	@Override
	public void visit(Host t) {
		System.out.println("Display difference");
		
	}

}
