import java.awt.Color;

public class Test {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(10,10, Color.RED);
		Point p = cp.asPoint();
		
		System.out.println(cp);
		cp.moveTo(20, 20);
		System.out.println(cp);
		p.moveTo(30, 30);
		System.out.println(cp);
	}
}