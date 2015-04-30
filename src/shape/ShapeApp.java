package shape;


public class ShapeApp {
	public static void main(String[] args) {
/*		Point point1 = new Point();
		point1.setX(2);
		point1.setY(5);

		Point point2 = new Point();
		point2.setX(10);
		point2.setY(23);

		Point point3 = new Point(5, 5);
		point1.show();
		point2.show();
		point3.show();

		point3.show(false);
		point3.show(true);*/
		
//		Point a = new ColorPoint(3, 4, "red");
/*		Point a = new ColorPoint();
		a.draw();*/
		
		// instanceof 테스트
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
//		Error : 
//		System.out.println(c instanceof Rect); -> 상속관계에서만 instanceof를 물어볼 수 있다.
 		
		Shape s = c;
		System.out.println(s instanceof Rect);
		
		
		
		
		

	}
}
