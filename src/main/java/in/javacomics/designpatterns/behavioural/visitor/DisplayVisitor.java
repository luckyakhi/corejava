package in.javacomics.designpatterns.behavioural.visitor;

public class DisplayVisitor implements Visitor{

	@Override
	public void visit(Host t) {
		t.accept(this);
	}

}
