package Draw;
import java.util.Scanner;

abstract public class Line extends Point{
	public void getline()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter coordinates ");
		int xc1 = x1.nextInt();
		int yc1 = y1.nextInt();
		int xc2 = x2.nextInt();
		int yc2 = y2.nextInt();
		System.out.println("enter colour ");
		String c=s.nextLine();
		System.out.println("Line drawn at coordinate ("+xc1+"x , "+yc1+"y) and ("+xc2+"x , "+yc2+"y)");
		System.out.println("colour: "+c);
	}
	abstract public void getrec();
	abstract public void getsq();
	abstract public void getcircle();
}