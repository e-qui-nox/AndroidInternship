
public class Rectangle extends Shapes{

		private int length;
		private int breadth;
		
		public Rectangle() {
			this.length=8;
			this.breadth=4;
		}
		
		public Rectangle(int length,int breadth) {
			this.length=length;
			this.breadth=breadth;
		}
		
		public void setArea() {
			area = (length*breadth);
		}
		
		public void setPerimeter() {
			perimeter=(2*(length+breadth));
		}

}
