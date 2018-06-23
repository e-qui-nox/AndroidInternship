
public class Square extends Shapes{
		private int side;
		
		public Square() {
			this.side=4;
		}
		
		public Square(int side) {
			this.side=side;
		}
		
		public void setArea() {
			area = (side*side);
		}
		
		public void setPerimeter() {
			perimeter= (4*side);
		}
}
