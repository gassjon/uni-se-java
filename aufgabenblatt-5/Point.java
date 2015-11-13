import java.lang.Math;

public class Point{

	final double xCoordinate;
	final double yCoordinate;

	public Point(){
		this.xCoordinate = 0;
		this.yCoordinate = 0;
	}

	public Point(double x, double y){
		if(x==0.0 || y==0.0){
			throw new NullPointerException("invalid point parameter, please enter a value != 0");
		}
		this.xCoordinate = x;
		this.yCoordinate = y;
	}

	public double getX(){
		return this.xCoordinate;
	}

	public double getY(){
		return this.yCoordinate;
	}

	public boolean sameAs(Point that){

		if(this.xCoordinate == that.getX() && this.yCoordinate == that.getY()){
			return true;

		} else{
			return false;
		}
	}

	public double distanceTo(Point that){
		double distance = Math.sqrt(Math.pow(that.getX()-this.xCoordinate,2) +Math.pow(that.getY()-this.yCoordinate,2));
		return distance;

	}

	/*public double angleTo(Point that){

	}

	*/public Point shiftedBy(double angle, double distance){

	}

	public final Point getMidway(Point that){

	}

	public boolean isOnLineWith(Point that, Point another){

	}*/
	public static void main(String... args){
		Point a = new Point(1,2);
		Point b = new Point(1,2);
		Point c = new Point(1,1);
		System.out.println(a.sameAs(b));
		System.out.println(a.distanceTo(c));
		

	}
}