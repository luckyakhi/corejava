package in.javacomics.innerclass;

public class OuterClass {
	private String outerClassMember;
	private InnerClass innerClass;

	public OuterClass(String outerClassMember, String innerClassMember) {
		super();
		this.outerClassMember = outerClassMember;
		innerClass = new InnerClass(innerClassMember);
	}

	private class InnerClass {
		private String innerClassMember;

		public InnerClass(String innerClassMember) {
			super();
			this.innerClassMember = outerClassMember+":"+innerClassMember;
		}

	}

	public InnerClass getInnerClass() {
		return innerClass;
	}

	public void setInnerClass(InnerClass innerClass) {
		this.innerClass = innerClass;
	}

	public String getOuterClassMember() {
		return outerClassMember;
	}

	public void setOuterClassMember(String outerClassMember) {
		this.outerClassMember = outerClassMember;
	}
	public String getInnerClassMember() {
		return innerClass.innerClassMember;
	}

	public void setInnerClassMember(String innerClassMember) {
		this.innerClass.innerClassMember=innerClassMember;
	}

}
