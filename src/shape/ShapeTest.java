package shape;

public class ShapeTest {
	public static void main(String[] args) {
	      Shape rect = new Rect();
	      Shape circle = new Circle();


	      // 인터페이스 테스트
	      Drawable drawable = new Point(10, 20);
	      drawable.draw();
	}

}
