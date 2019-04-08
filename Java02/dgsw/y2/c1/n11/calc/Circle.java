package dgsw.y2.c1.n11.calc;

public class Circle extends Rectangle {
	
	protected int radius;
	
	public Circle() {
		this.name = "±¸Çü";
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public int getArea() {
		return (int)(this.radius * this.radius * Math.PI);
	}
	
	public void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(10);
		circle.showResult();
	}
}
