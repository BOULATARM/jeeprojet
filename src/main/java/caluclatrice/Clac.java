package caluclatrice;

public class Clac {
	float a;
	float b;
	public Clac(float a,float b) {
		this.a=a;
		this.b=b;
	}
	public float sum() {
		return a+b;
	}
	public float div() {
		return a/b;
	}
	public float mul() {
		return a*b;
	}
	public float sou() {
		return a-b;
	}

}
