package dgsw.y2.c1.n11.calc;

public class Triangle extends Rectangle {
	
	public Triangle() {
		this.name = "»ï°¢Çü";
	}
	
	public int getArea() {
		return super.getArea() / 2;
	}
	
	@Override
	public void showResult() {
		super.showResult();
	}
	
	public void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.setWidth(8);
		triangle.setHeight(6);
		triangle.showResult();
	}
}
