package dgsw.y2.c1.n11.calc;

public class Rectangle {
	protected String name;
	protected int width;
	protected int height;
	
	public Rectangle() {
		this.name = "사각형";
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea() {
		return this.width * this.height;
	}
	
	public void showResult() {
		System.out.println(String.format(this.name + "의 넓이는 %d입니다.", getArea()));
	}
	
	public void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(8);
		rectangle.setHeight(6);
		rectangle.showResult();
	}
}
