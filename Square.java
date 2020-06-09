package Draw;
import java.util.Scanner;

abstract public class Square extends Rectangle{
	public void getsq()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter coordinates ");
		int xc1 = x1.nextInt();
		int yc1 = y1.nextInt();
		System.out.println("enter length");
		int l=x2.nextInt();
		System.out.println("enter colour ");
		String c=s.nextLine();
		System.out.println("square drawn at coordinate ("+xc1+"x , "+yc1+"y)."+" having length "+l);
		System.out.println("colour: "+c);
	}
	abstract public void getcircle();
}