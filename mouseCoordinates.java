import java.awt.MouseInfo;
import java.awt.Point;

public class mouseCoordinates {
public static void main(String[] arg){
	System.out.println("Hello world");
	
 Point location = MouseInfo.getPointerInfo().getLocation();
	double x = location.getX();
	double y = location.getY();

	System.out.println("x = " + x);
	System.out.println("y = " + y);


}
}
