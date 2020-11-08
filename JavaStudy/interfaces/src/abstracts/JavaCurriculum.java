package abstracts;

public abstract class JavaCurriculum {
private String name;

public JavaCurriculum(String name) {
	this.name =name;
}
public abstract void doJavaCurriculum();

protected String getName() {
	return name;
}
}
