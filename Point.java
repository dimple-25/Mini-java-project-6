package Draw;
import java.util.Scanner;

abstract public class Point extends Draw{
	public void getpoint()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter coordinates ");
		int xc = x1.nextInt();
		int yc = y1.nextInt();
		System.out.println("enter colour ");
		String c=s.nextLine();
		System.out.println("Point drawn at coordinate ("+xc+"x , "+yc+"y).");
		System.out.println("colour: "+c);
	}
	abstract public void getline();
	abstract public void getrec();
	abstract public void getsq();
	abstract public void getcircle();
}